package com.example.demo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by CTWLPC on 2017/9/14.
 */
@FeignClient(value = "client1",fallback = TestServiceImpl.class,qualifier = "client1")
public interface TestService {
    @RequestMapping(value = "/index/home/{name}",method = RequestMethod.GET)
    String welcome(@PathVariable(value = "name") String name);
}
