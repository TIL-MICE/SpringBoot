package com.lckiss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot!";
    }

    //默认模板引擎
    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    //模板引擎-数据渲染
    @RequestMapping("/data")
    public String data(HttpServletRequest request) {
        request.setAttribute("name","lckiss");

        List<String> userList=new ArrayList<String>();
        userList.add("张三");
        userList.add("李四");
        userList.add("王二");
        userList.add("麻子");

        request.setAttribute("userList",userList);
        return "data";
    }
}