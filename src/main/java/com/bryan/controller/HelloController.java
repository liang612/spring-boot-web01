package com.bryan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

    //配置默认访问首页
    @RequestMapping({"/","/login.html"})
    public final String login(){

        return "login";
    }

    @RequestMapping("/testSuccess")
    public final String testsuccess(Map<String,String> map){
        map.put("name","你牛批！！");
        return "success";
    }
}
