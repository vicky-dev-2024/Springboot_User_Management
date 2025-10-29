package com.vickycode.build_rest_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    
    @GetMapping("/hello")
    public String SayHello(){
        return "Hello World";
    }
    @GetMapping("/dsa")
    public String DSAHello(){
        return "Prepare DSA Rounds";
    }
    @GetMapping("/backend")
    public String BackendHello(){
        return "Hello Backend";
    }
     @GetMapping("/frontend")
    public String FrontendHello(){
        return "Hello Frontend";
    }
     @GetMapping("/devops")
    public String DevopsHello(){
        return "Hello Devops";
    }

}
