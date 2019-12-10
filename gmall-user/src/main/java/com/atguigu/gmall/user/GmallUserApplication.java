package com.atguigu.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.annotation.sql.DataSourceDefinitions;
/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/10/9 16:21
 */
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class GmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
