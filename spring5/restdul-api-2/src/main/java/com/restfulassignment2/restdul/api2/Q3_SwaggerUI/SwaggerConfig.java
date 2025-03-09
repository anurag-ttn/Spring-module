package com.restfulassignment2.restdul.api2.Q3_SwaggerUI;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI myConfig(){
        return new OpenAPI()
                .info(
                        new Info()
                                .title("swagger Q3 api")
                                .description("by anurag")
                );
    }
}
