package com.yan.sharding_jdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.yan.sharding_jdbc.mapper")
@SpringBootApplication
public class GoodApplication {

	public static void main(String[] args) {
        SpringApplication.run(GoodApplication.class, args);
    }
}
