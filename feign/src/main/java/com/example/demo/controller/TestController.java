package com.example.demo.controller;

import com.example.demo.service.TestService;
import com.example.demo.service.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by CTWLPC on 2017/9/14.
 */
@RestController
public class TestController {
    @Autowired
    @Qualifier("client1")
    private TestService testService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name",defaultValue = "shusf") String name){
        String returnValue = testService.welcome(name);
        System.out.println(returnValue);
        return returnValue;
    }
}
