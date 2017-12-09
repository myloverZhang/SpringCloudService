package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by CTWLPC on 2017/9/18.
 */
@Component
public class TestServiceImpl implements TestService{
    @Override
    public String welcome(String name) {
        return "sorry,feign...";
    }
}
