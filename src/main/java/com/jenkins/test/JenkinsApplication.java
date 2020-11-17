package com.jenkins.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description
 * @Auther: hh
 * @Date: 2020/11/17 10:22
 * @Version:1.0
 */
@Controller
@SpringBootApplication
public class JenkinsApplication {

    @GetMapping("/index")
    public String index() {
        return "index";

    }

    //作为项目启动入口
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }
}
