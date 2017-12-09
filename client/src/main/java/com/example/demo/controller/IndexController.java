package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by CTWLPC on 2017/9/14.
 */
@RestController
@RequestMapping(value = "/index")
public class IndexController {
    @Value("${server.port}")
    private String port;
    @GetMapping(value = "/home/{name}")
    public String home(@PathVariable String name){
        return String.format("hi %s, I am from port:%s",name, port);
    }
}
