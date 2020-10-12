package com.hbut.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@SpringBootApplication
@ComponentScan(basePackages = {"com.hbut"})
public class StartApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(StartApplication.class);
        log.info("启动,端口"+run.getEnvironment().getProperty("server.port"));
    }
}