package com.twt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.twt.mapper")
public class TokenApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenApplication.class, args);
    }
}
