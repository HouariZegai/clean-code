package com.houarizegai.tenniskata.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Swagger2Config {

    @Bean
    public OpenAPI apiEndpointsInfo() {
        Info info = new Info()
                .title("Tennis Kata")
                .description("Tennis game kata implementation")
                .version("v0.0.1")
                .contact(new Contact().name("Houari ZEGAI").url("https://zegai.netlify.app").email("houarizegai14@gmail.com"))
                .license(new License().name("Apache 2.0").url("http://www.apache.org/licenses/LICENSE-2.0.html"));

        return new OpenAPI().info(info);
    }
}
