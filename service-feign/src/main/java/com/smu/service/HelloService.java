package com.smu.service;

import com.smu.service.impl.SchedualServiceHiHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by programmer_qn on 2017/10/14 0014.
 * project springcloud
 */
@FeignClient(value = "service-client",fallback = SchedualServiceHiHystric.class)
public interface HelloService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
