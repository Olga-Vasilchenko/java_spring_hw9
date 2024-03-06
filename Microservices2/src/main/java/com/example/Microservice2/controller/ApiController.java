package com.example.Microservice2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/service2")
public class ApiController {

    @GetMapping("/hello")
    public String hello(){
    return "hello from micro_service2";
    }
}

