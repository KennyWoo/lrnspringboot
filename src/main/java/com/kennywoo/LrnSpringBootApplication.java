package com.kennywoo;

/*
    IDEA 快捷键 :
    Alt + Enter -> 导入包自动修正
    Ctrl + Alt + O (不是数字) -> 优化导入的类和包
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kennywoo on 2017/3/1.
 */
@RestController // 渲染
//@Configuration
//@Import
//@ImportResource
@SpringBootApplication // 开启组件扫描和自动配置
public class LrnSpringBootApplication {

    private static Logger logger = LoggerFactory.getLogger(LrnSpringBootApplication.class);

    @RequestMapping("/") // 提供路由信息
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(LrnSpringBootApplication.class, args); // 启动应用程序

        System.out.println("OK");

        logger.info("===OK===");
    }

    @Bean
    public HealthIndicator helloHealthIndicator() {
        return new HealthIndicator() {
            @Override
            public Health health() {
                return Health.up().withDetail("hello", "world").build();
            }
        };
    }

}
