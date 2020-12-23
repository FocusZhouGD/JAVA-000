package com.example.sharedingspherereadwrite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.sharedingspherereadwrite.mapper")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class SharedingspherereadwriteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedingspherereadwriteApplication.class, args);
    }

}
