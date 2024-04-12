package com.my;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

//@MapperScan("com.my.mapper")
@MapperScan(value = "com.my.mapper")
//@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class MybatisApplication {
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(MybatisApplication.class, args);
        System.out.println("");
    }
}
