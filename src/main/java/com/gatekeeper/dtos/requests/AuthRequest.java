package com.gatekeeper.dtos.requests;

import lombok.Data;

@Data
public class AuthRequest {
    private String domain;
    private String userName;
    private String password;
}
