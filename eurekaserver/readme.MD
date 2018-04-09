### eureka注册中心

##### 添加maven依赖

    <dependency>
        <groupId>org.springframework.cloud</groupId>
        <artifactId>spring-cloud-starter-eureka-server</artifactId>
    </dependency>
    
##### 添加配置

    server:
      port: 8761
    
    eureka:
      instance:
        hostname: localhost
      #关闭保护模式
      server:
        enable-self-preservation: false
      client:
        #是否注册到注册中心
        registerWithEureka: false
        #是否拉取信息
        fetchRegistry: false
        #注册中心地址
        serviceUrl:
          defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/
          
##### 添加注解
    
    在springboot项目启动类上添加注解
    @EnableEurekaServer