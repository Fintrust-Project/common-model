package com.fintrust.common_model.request.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class ValidateTokenRequest {
    private String accessToken;
    private String refreshToken;
}
