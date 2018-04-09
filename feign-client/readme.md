### feign使用

##### 添加maven依赖

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-feign</artifactId>
    </dependency>
    
##### 在服务接口上添加注解
    
    @FeignClient(value="服务名称")
    
##### 使用

在需要使用feign的服务启动类上添加注解,然后再具体使用的类中注入FeignClient
    
    @EnableFeignClients(basePackages = "com.github.client")   
    
##### 添加hystrix熔断机制

1.添加配置
    
    feign:
        hystrix:
          enabled: true
2.定义fallbackFactory

    具体代码参考:com.github.client.HystrixClientFallback 