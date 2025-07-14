package com.gatekeeper.controllers.v1;

import com.gatekeeper.annotations.ApiVersion;
import com.gatekeeper.dtos.requests.AuthRequest;
import com.gatekeeper.dtos.responses.AuthResponse;
import com.gatekeeper.dtos.responses.Response;
import com.gatekeeper.entities.TokenType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@ApiVersion("1")
public class AuthController {

    @PostMapping("/login")
    public Response<AuthResponse> login(@RequestHeader("Host") String host, @RequestBody AuthRequest request){
        request.setDomain(host.split(":")[0]);
        System.out.println("host = "+host);
        AuthResponse response = new AuthResponse();
        response.expiresIn = 23400;
        response.accessToken = "test access token";
        response.tokenType = TokenType.JWT;

        return Response.OK(response);
    }


}
