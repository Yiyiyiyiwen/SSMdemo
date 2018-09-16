package com.heitian.ssm.service.impl;

import com.heitian.ssm.dao.StudentDao;
import com.heitian.ssm.model.User;
import com.heitian.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentDao studentDao;

    public User getUserById(Long userId) {
        return studentDao.selectUserById(userId);
    }
}
