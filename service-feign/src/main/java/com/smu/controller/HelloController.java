package com.smu.controller;

import com.smu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by programmer_qn on 2017/10/14 0014.
 * project springcloud
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hello")
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }
}
