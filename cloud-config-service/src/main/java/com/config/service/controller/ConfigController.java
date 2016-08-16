package com.config.service.controller;


import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class ConfigController {

    @Value("${env}")
    String env;

    @ApiOperation(value = "get env", notes = "get env notes", httpMethod = "GET")
    @RequestMapping(value = "/env")
    public String getEnv(){
        return env;
    }

    @ApiOperation(value = "get env from config", notes = "get env from config notes", httpMethod = "GET")
    @RequestMapping(value = "/env/config")
    public String getEnvFromConfigService(){
        return env + "cloud-config-service";
    }

}
