package cn.jiyun.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "cn.jiyun.feign")
public class ItemWebApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemWebApp.class, args);
    }
}