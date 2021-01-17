package com.twilio.api;

import com.twilio.models.SMS;
import com.twilio.models.SendSmsRequest;
import com.twilio.models.basemodel.BaseApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value ="/api/v1")
public interface ApplicationApi {

    @PostMapping("/send")
    ResponseEntity<?> sendSms(@RequestBody SendSmsRequest sms);
}
