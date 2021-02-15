package cn.jiyun.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("cn.jiyun.mapper")
public class ItemServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ItemServiceApp.class, args);
    }
}