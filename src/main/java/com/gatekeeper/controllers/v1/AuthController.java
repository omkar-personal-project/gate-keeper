package com.gatekeeper.controllers.v1;

import com.gatekeeper.annotations.ApiVersion;
import com.gatekeeper.dtos.responses.AuthResponse;
import com.gatekeeper.dtos.responses.Response;
import com.gatekeeper.entities.TokenType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@ApiVersion("1")
public class AuthController {

    @PostMapping("/login")
    public Response<AuthResponse> login(){
        AuthResponse response = new AuthResponse();
        response.expiresIn = 23400;
        response.accessToken = "test access token";
        response.tokenType = TokenType.JWT;

        return Response.OK(response);
    }


}
