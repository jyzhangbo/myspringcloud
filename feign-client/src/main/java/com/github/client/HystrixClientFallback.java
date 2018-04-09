package com.github.client;

import com.github.user.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * zhangbo
 */
@Component
public class HystrixClientFallback implements FallbackFactory<HomeClient>{


    @Override
    public HomeClient create(Throwable throwable) {
        return new HomeClient() {
            @Override
            public User queryUser() {
                User user = new User();
                user.port = "1234";
                user.name = "hystrix";
                user.address = throwable.getLocalizedMessage();
                return user;
            }
        };
    }
}
