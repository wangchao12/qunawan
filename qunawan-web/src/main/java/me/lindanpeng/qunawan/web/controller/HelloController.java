package me.lindanpeng.qunawan.web.controller;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class HelloController {
    @Autowired
    @Qualifier("userDataSource")
    DataSource userDataSource;
    @RequestMapping("config")
    public String hello(){
        System.out.println(((DruidDataSource)userDataSource).getUrl());
        return "config world!";
    }
}
