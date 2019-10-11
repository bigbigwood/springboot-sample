package com.example.springcloud.mail;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Console;

@RestController
public class MailController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/send")
    public String sendMail() {
        System.out.println(appName);
        return "Request done by" + appName;
    }
}
