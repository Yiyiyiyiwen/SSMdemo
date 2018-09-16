package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.UserDao;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

//这个注解是必要的
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    //service同时获取dao和service接口，编写依赖和实例代码
    //注意dao也是一个接口，是不能实例化的，如果不是ioc，甚至都不能使用，这都是为了实现面向接口编程
    @Resource
    private UserDao userDao;

    //重点看这里的代码，函数名是向上的service，函数体是向下的dao，就这样产生了联系
    //注意这些函数返回值的类型
    //spring统一管理所有程式，我们的工作回归设计对象和类
    public User getUserById(Long userId) {
        return userDao.selectUserById(userId);
    }
    
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone,state);
    }
    
    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
