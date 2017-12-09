package com.example.demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by CTWLPC on 2017/9/14.
 */
@Service
public class TestService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name){
        String returnValue = restTemplate.getForObject("http://CLIENT1/index/home/"+name,String.class);
        System.out.println(returnValue);
        return returnValue;
    }

    public String error(String name){
        return "hi," + name + ", error";
    }
}
