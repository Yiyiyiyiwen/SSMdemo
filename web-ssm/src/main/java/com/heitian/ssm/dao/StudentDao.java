package com.heitian.ssm.dao;

import com.heitian.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//只有将dao注册成bean（也就是spring组件），才能使同级，让dao和xml建立绑定，不然不同级无法建立
@Repository
public interface StudentDao {
    User selectUserById(@Param("userId") Long userId);

}
