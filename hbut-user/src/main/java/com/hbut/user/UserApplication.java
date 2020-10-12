package com.hbut.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class UserApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(UserApplication.class);
        log.info("user服务启动,端口"+run.getEnvironment().getProperty("server.port"));
    }
}
