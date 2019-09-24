package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * created by wyx on 2019/9/7
 */
@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/w")
    public String testHello() {
        LocalDateTime time = LocalDateTime.now();
        System.out.println("Time:"+time+"  There is a http request.");
        return "Time:"+time+"       There is a http request!";
    }
}
