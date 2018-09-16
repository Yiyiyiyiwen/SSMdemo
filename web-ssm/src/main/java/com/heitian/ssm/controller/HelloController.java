package com.heitian.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.heitian.ssm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "hello";
    }

    @RequestMapping(value = "/json")    //通过这个标签可以直接返回json
    @ResponseBody
    public String sayJson() {

        //尝试构建json
        User u1=new User();
        u1.setId((long)15);
        u1.setUserName("你好");

        User u2=new User();
        u2.setId((long)152);
        u2.setUserName("你好2");
        Map<String,User> map=new HashMap<String, User>();
        map.put("001", u1);
        map.put("002", u2);
        String jsonString = JSON.toJSONString(map);
        return jsonString;
    }

}
