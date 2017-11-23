package com.zzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/11/23.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerApplication {

    @Bean
    @LoadBalanced //ribbon
    public RestTemplate restTemplate() {  // equals to RestTemplate restTemplate = new RestTemplate()
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
