package com.twilio.exceptions;

public class FromPhoneNumberMissingException extends RuntimeException{

    public FromPhoneNumberMissingException() {
        super("The from phone number is missing, please provide with a valid number");
    }
}
