package com.heitian.ssm.test;

import com.heitian.ssm.controller.UserController;

public class LogTest {

    //测试UserController .class
    public static void main(String[] args) {

        System.out.println(UserController .class);
        //这里输出 class com.heitian.ssm.controller.UserController，也就是包名带类名的绝对路径
        //这应该是Object的自带属性，和toString是一级的
    }

}
