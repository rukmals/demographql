package com.example.demowar3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorld {


    @RequestMapping("/")
    public String Hello(){
        return "Hello World";
    }
}
