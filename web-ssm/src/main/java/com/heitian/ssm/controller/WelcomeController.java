package com.heitian.ssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping("/welcomeHtml")
    public String showWelcomeHtml() {

        return "welcome";

    }

    @ResponseBody
    @RequestMapping("/welcome")
    public String showWelcome(@RequestParam("name") String name, @RequestParam("age") String age) {

        String[] a = {name, age};

        return a.toString();

    }

}
