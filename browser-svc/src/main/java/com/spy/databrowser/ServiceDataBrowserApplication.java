package com.spy.databrowser;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceDataBrowserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceDataBrowserApplication.class,args);
    }
}
