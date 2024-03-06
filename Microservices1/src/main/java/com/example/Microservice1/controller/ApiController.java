package com.example.Microservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service1")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
        return "hello from micro_service1";
    }
}
