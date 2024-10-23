package com.vahini.demo.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String showHelloWorld() {
        return "HelloWorld !! Welcome to Spring World";
    }

}
