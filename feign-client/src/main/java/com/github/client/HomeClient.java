package com.github.client;

import com.github.user.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "user-server")
public interface HomeClient {

    @RequestMapping(value = "/user/query")
    public User queryUser();

}
