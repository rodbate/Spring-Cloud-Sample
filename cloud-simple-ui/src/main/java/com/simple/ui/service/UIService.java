package com.simple.ui.service;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class UIService {

    @Autowired
    RestTemplate restTemplate;

    private final String CONFIG_SERVICE_NAME = "cloud-config-service";


    @HystrixCommand(fallbackMethod = "fallbackEnv")
    public String getEnv(){
        return restTemplate.getForObject("http://" + CONFIG_SERVICE_NAME + "/api/env/config", String.class);
    }

    public String fallbackEnv(){
        return "Hystrix";
    }
}
