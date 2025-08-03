package com.amal.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.amal.helloHuman.controllers")
public class HelloHumanApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloHumanApplication.class, args);
    }
}
