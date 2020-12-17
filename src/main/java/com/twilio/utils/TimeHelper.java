package com.twilio.utils;

import java.sql.Timestamp;
import java.util.Date;

public class TimeHelper {
    public static Timestamp getTime() {
        return new Timestamp(new Date().getTime());
    }
}
