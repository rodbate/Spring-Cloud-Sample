package com.simple.ui.controllers;


import com.simple.ui.service.UIService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class UIController {

    @Autowired
    UIService uiService;

    @ApiOperation(value = "get env", notes = "env", httpMethod = "GET")
    @RequestMapping(value = "/env/ui")
    public String getEnv(){

        return uiService.getEnv();
    }
}
