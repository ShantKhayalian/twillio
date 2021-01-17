package com.twilio.models.basemodel;


import com.twilio.models.authbase.AuthBase;
import com.twilio.models.SMS;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BaseApplication {
    private AuthBase authBase;
    @NonNull
    private SMS phoneNumber;
}
