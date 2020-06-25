package com.pingan.springcloud.cloudzuulgateway9527;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class CloudZuulGateway9527Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudZuulGateway9527Application.class, args);
    }

}
