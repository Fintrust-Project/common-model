package com.fintrust.common_model.response.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateAuthTokenResponse {
    private String accessToken;
    private String refreshToken;
    private Date accessTokenExpTime;
    private Date refreshTokenExpTime;
}
