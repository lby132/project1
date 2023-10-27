package com.example.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @RequestMapping("/controller")
    public String test() {
        return "ok";
    }
}
