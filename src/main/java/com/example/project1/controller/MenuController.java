package com.example.project1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("menu")
public class MenuController {

    @RequestMapping("/clothes")
    public String clothes() {

        return "ok";
    }
}
