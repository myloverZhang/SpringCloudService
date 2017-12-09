package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CTWLPC on 2017/9/19.
 */
@RestController
public class ConfigClientController {
    @Value("${name}")
    private String foo;

    @Value("${age}")
    private Integer age;
    @GetMapping(value = "/hi")
    public String hi(){
        return foo;
    }
    @GetMapping(value = "/age")
    public Integer age(){
        return age;
    }
}
