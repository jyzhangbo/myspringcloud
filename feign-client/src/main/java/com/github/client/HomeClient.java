package com.github.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "eureka-client")
public interface HomeClient {

    @RequestMapping(value = "/getName")
    public User home(String name);

}
