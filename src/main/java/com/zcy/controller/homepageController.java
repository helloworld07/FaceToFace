package com.zcy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

/**
 * Created by zcy on 2018/9/26.
 */
@Controller
@RequestMapping("/page")
public class homepageController {
    @RequestMapping("/home")
    public String homePage(){
        return "homepage";
    }

    @RequestMapping("/error")
    public String errorPage(){
        return "errorpage";
    }

}
