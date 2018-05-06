package com.base.controller;

import com.base.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);


    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/index")
    public String index (){
        logger.info("首次进入");
        logger.debug("===========debug");
        logger.error("===========ERROR");
        return "Hello";
    }


    @ResponseBody
    @RequestMapping("/user")
    public String getUser(){
        String id = "1";
        return userService.getUser(id).toString();
    }


    @ResponseBody
    @RequestMapping("/user2")
    public String getUser2(){
        String id = "1";
        String s = userService.userEx(id);
        return s;
    }
}
