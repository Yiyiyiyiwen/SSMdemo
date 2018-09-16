package com.heitian.ssm.controller;

import com.heitian.ssm.model.User;
import com.heitian.ssm.service.StudentService;
import com.heitian.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class StudentController {

    @Resource
    StudentService studentService;
    @Resource
    private UserService userService;

    @RequestMapping(value = "/hate")
    @ResponseBody
    public String showAll() {
//        String a = studentService.getUserById((long) 20).toString();
//        List<User> userList = userService.getAllUser();
//        String s = userList.toString();
        User user = studentService.getUserById((long) 5);
        String name = user.getUserName();
        return name;
    }

    @RequestMapping(value = "/h")
    @ResponseBody
    public String showAll2() {
//        String a = studentService.getUserById((long) 20).toString();

        return "222222333333";
    }
}
