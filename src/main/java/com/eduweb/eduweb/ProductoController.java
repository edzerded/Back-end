package com.eduweb.eduweb;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ComponentScan("com.eduweb.eduweb")
@EntityScan("com.eduweb.eduweb.entity")

public class ProductoController {

    public static void main(String[] args) {
        SpringApplication.run(EduwebApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to EduWeb!";
    }
}