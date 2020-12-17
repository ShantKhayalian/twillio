package com.twilio.models.authbase;

import com.twilio.constances.ApiConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthBase {
    private String SID = ApiConstants.SID;
    private String token = ApiConstants.AUTH_TOKEN;


}
