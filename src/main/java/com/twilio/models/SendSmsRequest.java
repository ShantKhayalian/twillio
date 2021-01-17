package com.twilio.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SendSmsRequest extends SMS {
    private Long userId;
    private String email;
    private String phoneNumber;
    private String secret;
}
