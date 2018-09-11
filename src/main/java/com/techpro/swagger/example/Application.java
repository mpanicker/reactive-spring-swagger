package com.techpro.swagger.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

@SpringBootApplication
@EnableSwagger2WebFlux
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }
}
