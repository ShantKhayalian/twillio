package com.twilio.implimentation;

import com.twilio.common.BaseApiResponse;
import com.twilio.models.SMS;
import com.twilio.models.SendSmsRequest;
import com.twilio.service.SendSmsService;
import com.twilio.service.action.SendSmsActions;
import com.twilio.utils.GsonConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import static com.twilio.utils.ResponseConverter.falseAlert;
import static com.twilio.utils.ResponseConverter.trueAlert;

@Service
@RequiredArgsConstructor
@Log4j2
@PropertySource("classpath:application.properties")
public class SendSmsServiceImplementation implements SendSmsService, SendSmsActions {

    private final GsonConverter gsonConverter;
    @Value("${app.auth.token}" )
    private String authToken;
    @Value("${app.sid}" )
    private String SID;
    @Value("${app.from}")
    private String from;

    @Override
    public ResponseEntity<BaseApiResponse<?>> sendSms(SendSmsRequest sms) {
        BaseApiResponse<?> response = sendSmsAction(sms);
        return new ResponseEntity<>(response, HttpStatus.valueOf(response.getCode()));
    }

    @Override
    public BaseApiResponse<?> sendSmsAction(SendSmsRequest sendSmsRequest) {
        SMS sms = new SMS();
        sms.setMessage(sendSmsRequest.getSecret());
        sms.setTo(sendSmsRequest.getPhoneNumber());
        Twilio.init(SID, authToken);
        Map<String, Object> body = new HashMap<>();
        try {
            Message message = Message.creator(new PhoneNumber(
                    sms.getTo()),new PhoneNumber(from),
                    sms.getMessage()).create();
            log.info("message.getSid() {} ",message.getSid());
        }catch (Exception e){
            log.error("Error found inside sendSmsAction() inside SendSmsServiceImplementation with error {} ",e.getMessage());
            body.put("message" ,e.getMessage());
            return falseAlert(body);

        }
        log.info("sendSmsAction success {} ",body);
        return trueAlert(body);

    }
}
