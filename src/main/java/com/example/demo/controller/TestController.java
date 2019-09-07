package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by wyx on 2019/9/7
 */
@RestController
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/w")
    public String testHello() {
        System.out.println("hello!!!!!!!!!!!!!!!!!!!!!!!");
        return "Hello world!";
    }
}
