package com.gatekeeper.dtos.responses;

import com.gatekeeper.entities.TokenType;

public class AuthResponse implements IResponseData {
    public String accessToken;
    public long expiresIn;
    public TokenType TokenType;
}
