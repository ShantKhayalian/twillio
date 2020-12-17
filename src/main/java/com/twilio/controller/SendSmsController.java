package com.twilio.controller;

import com.twilio.api.ApplicationApi;
import com.twilio.common.BaseApiResponse;
import com.twilio.exceptions.FromPhoneNumberMissingException;
import com.twilio.models.SMS;
import com.twilio.models.basemodel.BaseApplication;
import com.twilio.service.SendSmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor

public class SendSmsController implements ApplicationApi {
    private final SendSmsService sendSmsService;

    @Override
    public ResponseEntity<?> sendSms(BaseApplication baseApplication) {
        if(baseApplication.getPhoneNumber().getFromPhoneNumber().isEmpty()) throw new FromPhoneNumberMissingException();
        if(baseApplication.getPhoneNumber().getToPhoneNumber().isEmpty()) throw new FromPhoneNumberMissingException();
        if(baseApplication.getPhoneNumber().getMessageBody().isEmpty()) throw new FromPhoneNumberMissingException();
        ResponseEntity<BaseApiResponse<?>> response = sendSmsService.sendSms(baseApplication);
        return new ResponseEntity<>(response.getBody(), response.getStatusCode());
    }
}
