package com.gatekeeper.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(name="swagger.enabled", havingValue = "true", matchIfMissing = false)
public class SwaggerConfig {

    public OpenAPI baseOpenApi(){
        return new OpenAPI()
                .info(new Info()
                        .title("Gate Keeper")
                        .version("1.0")
                        .description("GateKeeper auth platform")
                );
    }
}
