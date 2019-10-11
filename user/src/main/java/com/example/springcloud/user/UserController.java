package com.example.springcloud.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/create")
    public String createUser() {
        String result = ribbonService.hi("wood");
        System.out.println(result);
        return result;
    }
}