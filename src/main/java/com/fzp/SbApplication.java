package com.fzp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fzp.mapper")
public class SbApplication {
    public static void main(String[] args) {
        SpringApplication.run(SbApplication.class, args);
    }
}
