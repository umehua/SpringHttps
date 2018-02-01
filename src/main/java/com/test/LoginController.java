package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/secure/hello")
    public String helloWorld() {
        return "secure hello";
    }
}
