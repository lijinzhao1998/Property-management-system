package com.softwarefirst.communitymannger.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program: communitymannger
 * @description:
 * @author: li jinzhao
 * @create: 2020-03-11 11:39
 */
@Controller
public class HelloWordContorller {
    @RequestMapping("/hello")
    public @ResponseBody Object hello(){
        return "7777777";

    }
}
