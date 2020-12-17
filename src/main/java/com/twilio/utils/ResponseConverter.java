package com.twilio.utils;


import com.twilio.common.BaseApiResponse;
import org.springframework.http.HttpStatus;
import java.util.Map;
import static com.twilio.utils.TimeHelper.getTime;


public class ResponseConverter {

    public static BaseApiResponse<?> trueAlert(Map<String, Object> body){
        return new BaseApiResponse<>(getTime(), true, HttpStatus.OK.value(), body);
    }

    public static BaseApiResponse<?> falseAlert(Map<String, Object> body) {
        return new BaseApiResponse<>(getTime(), false, HttpStatus.FORBIDDEN.value(), body);
    }

}
