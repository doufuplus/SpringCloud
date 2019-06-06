package com.doufu.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka服务提供方
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCenterApplication.class, args);
    }

}
