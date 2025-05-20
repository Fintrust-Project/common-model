package com.fintrust.common_model.request.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class AuthToken {
    private String accessToken;
    private String refreshToken;
    private long accessTokenExpiryTime;
    private long refreshTokenExpiryTime;
}
