### zuul网关配置

##### 添加maven依赖

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-zuul</artifactId>
    </dependency>
    //网关也需要作为一个服务注册到注册中心
    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka</artifactId>
    </dependency>
    
##### 添加配置文件

    server:
      port: 8089
    spring:
      application:
        name: gateway-server
    eureka:
      client:
        service-url:
          defaultUrl: http://localhost:8761/eureka/
    zuul:
      ignored-services: "*"
      routes:
          #服务名: 路径
          app-server: /app/**
          user-server: /user/**
  
##### 添加注解启动zuul
    
    在项目启动类上添加注解
    @EnableZuulProxy   
    
##### 添加熔断处理

    需要实现ZuulFallbackProvider，具体代码参考com.github.provider.ServiceProvider
    
##### 添加过滤器

    需要基础ZuulFilter，具体代码参考com.github.filter.AccessFilter    
    
    
     