package com.gatekeeper.dtos.responses;

import com.gatekeeper.entities.TokenType;

public class AuthResponse {
    public String accessToken;
    public long expiresIn;
    public TokenType tokenType;
}
