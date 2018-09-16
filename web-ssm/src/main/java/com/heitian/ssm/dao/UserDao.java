package com.heitian.ssm.dao;

import com.heitian.ssm.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

//database->entity->mapper.xml->mapper.interface->dao->service->controller->http-request
//这个类的主要作用就是通过mapper.xml对接数据库，如何对接就和ioc有关系了，只管实现不管依赖才是spring的核心，这就是解耦
//对接数据库，封装操作，向service提供数据库操作接口

//这个注解@Repository用于标注数据访问组件，即DAO组件
//@Repository和@Service和@Controller都是@Component的别名，spring都会把它们当做需要注入的Bean加载在上下文中
//@Autowired和@Resources则是同名的。代表bean注入到当前程序
@Repository
public interface UserDao {

    //把xml中定义的操作抽离出来，封装成类和方法
    //和向上提供服务的service相比，dao是向下封装sql操作成类方法的
    //这其中的Param参数必须和xml中的同名
    User selectUserById(@Param("userId") Long userId);

    User selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone, @Param("state") Short state);

    List<User> selectAllUser();
}
