package org.francis.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DubboSpringcloudProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringcloudProviderApplication.class, args);
    }

}
