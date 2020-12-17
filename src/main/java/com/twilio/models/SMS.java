package com.twilio.models;

import com.sun.istack.internal.NotNull;
import com.twilio.models.basemodel.BaseApplication;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SMS {
    @NonNull
    private String fromPhoneNumber;
    @NotNull
    private String toPhoneNumber;
    @NotNull
    private String messageBody;
}
