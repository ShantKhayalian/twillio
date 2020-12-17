package com.twilio.exceptions;

public class SmsBodyEmptyException extends RuntimeException {
    public SmsBodyEmptyException() {
        super("SMS body is empty, please provide with a valid number");
    }
}
