package com.jenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Auther: hh
 * @Date: 2020/11/17 10:22
 * @Version:1.0
 */
@RestController
@SpringBootApplication
public class JenkinsApplication {

    @RequestMapping("/jenkins/test")
    String index() {
        return "Hello jenkins Boot test!";

    }

    //作为项目启动入口
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }
}
