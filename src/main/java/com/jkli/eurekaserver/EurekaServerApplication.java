package com.jkli.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 开启服务注册中心
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
//        new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
