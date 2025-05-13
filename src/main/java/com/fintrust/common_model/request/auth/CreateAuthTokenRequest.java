package com.fintrust.common_model.request.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAuthTokenRequest {
    private String userName;
    private String password;
    private String mobileNo;
    private String emailId;
    private String jwtToken;
    private String refreshToken;
    private TokenType mode;
    private String otp;
}
