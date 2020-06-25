package com.pingan.springcloud.cloudproviderdept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderDept8001Application.class, args);
    }

}
