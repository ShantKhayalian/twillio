package com.twilio.exceptions;

public class ToPhoneNumberMissingException extends RuntimeException{

    public ToPhoneNumberMissingException() {
        super("to who phone number is missing, please provide with a valid number");
    }
}
