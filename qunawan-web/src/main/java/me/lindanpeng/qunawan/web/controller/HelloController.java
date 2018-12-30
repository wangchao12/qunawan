package me.lindanpeng.qunawan.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("config")
    public String hello(){
        return "config world!";
    }
}
