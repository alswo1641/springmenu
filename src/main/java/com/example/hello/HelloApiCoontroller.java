package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiCoontroller {
    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/hellokr")
    String hello() {
        return "헬로 월드!";
    }


}
