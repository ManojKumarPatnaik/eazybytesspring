package com.eazybytes.eazyschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EasySchoolController {

    //Setup requestmapper method

    @RequestMapping(value = {"", "/","/home"})
    public String sayHello() {
        return "home.html";
    }
}
