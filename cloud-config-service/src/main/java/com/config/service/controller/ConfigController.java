package com.config.service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ConfigController {

    @Value("${env}")
    String env;

    @RequestMapping(value = "/env")
    public String getEnv(){
        return env;
    }

}
