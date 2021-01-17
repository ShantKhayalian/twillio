package com.twilio.service.action;

import com.twilio.common.BaseApiResponse;
import com.twilio.models.SMS;
import com.twilio.models.basemodel.BaseApplication;

public interface SendSmsActions {
    BaseApiResponse<?> sendSmsAction(SMS sms);
}
