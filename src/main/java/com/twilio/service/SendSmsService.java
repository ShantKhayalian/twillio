package com.twilio.service;

import com.twilio.api.ApplicationApi;
import com.twilio.common.BaseApiResponse;
import com.twilio.models.SMS;
import com.twilio.models.SendSmsRequest;
import com.twilio.models.basemodel.BaseApplication;
import org.springframework.http.ResponseEntity;

public interface SendSmsService {
    ResponseEntity<BaseApiResponse<?>> sendSms(SendSmsRequest sms) ;
}
