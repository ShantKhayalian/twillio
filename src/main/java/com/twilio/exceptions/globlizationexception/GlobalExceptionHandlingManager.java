package com.twilio.exceptions.globlizationexception;

import com.twilio.exceptions.FromPhoneNumberMissingException;
import com.twilio.exceptions.SmsBodyEmptyException;
import com.twilio.exceptions.ToPhoneNumberMissingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandlingManager extends ResponseEntityExceptionHandler {

    @ExceptionHandler(FromPhoneNumberMissingException.class)
    public ResponseEntity<String> StripeErrorHandling(FromPhoneNumberMissingException fromPhoneNumberMissingException) {
        return new ResponseEntity<>(fromPhoneNumberMissingException.getMessage(), HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(ToPhoneNumberMissingException.class)
    public ResponseEntity<String> StripeErrorHandling(ToPhoneNumberMissingException toPhoneNumberMissingException) {
        return new ResponseEntity<>(toPhoneNumberMissingException.getMessage(), HttpStatus.NO_CONTENT);
    }

    @ExceptionHandler(SmsBodyEmptyException.class)
    public ResponseEntity<String> StripeErrorHandling(SmsBodyEmptyException smsBodyEmptyException) {
        return new ResponseEntity<>(smsBodyEmptyException.getMessage(), HttpStatus.NO_CONTENT);
    }
}
