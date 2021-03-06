package com.atguigu.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 *@author：Mr.qiu
 *@version: 1.0.0.0
 *@date：2019/12/11 22:54
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserWebApplication.class, args);
    }

}
