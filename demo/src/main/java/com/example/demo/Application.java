package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.TestUserEntity;
import com.example.demo.service.TestService;

@SpringBootApplication
@Controller
@ResponseBody
// @MapperScan(basePackages = "com.example.demo.dao")
public class Application {
    @Autowired
    TestService testService;


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RequestMapping("/hello")
    public String hello() {
        List<TestUserEntity> list = testService.queryUsers();
        System.out.println(list.size());
        return "Hello";

    }
}
