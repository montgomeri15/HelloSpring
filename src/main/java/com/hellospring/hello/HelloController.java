package com.hellospring.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final String hello = "Hello Spring!";

    @RequestMapping("/")
    public String helloWorld() {
        return hello;
    }
}
