package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Application在spring-boot中有两个作用：
 * 配置和启动引导
 * <p>
 * SpringBootApplication:开启组件扫描和自动配置
 */
@SpringBootApplication
@RestController
public class MclSpringBootApplication {
    @RequestMapping("/hello")
    public String hello() {
        return "hello word";
    }

    public static void main(String[] args) {
        // 负责启动引导应用程序
        SpringApplication.run(MclSpringBootApplication.class, args);
    }
}
