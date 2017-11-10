package com.smu.service.impl;

import com.smu.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by programmer_qn on 2017/10/14 0014.
 * project springcloud
 */
@Component
public class SchedualServiceHiHystric implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Feign error "+name;
    }
}
