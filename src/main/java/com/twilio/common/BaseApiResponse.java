package com.twilio.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseApiResponse<T> {
    private Timestamp date = new Timestamp(new Date().getTime());
    private boolean status;
    private int code;
    private T data;
}
