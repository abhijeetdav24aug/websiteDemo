package com.base.service.impl;

import com.base.bean.User;
import com.base.dao.UserDao;
import com.base.service.BaseService;
import com.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl extends BaseService implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(String id) {
        return userDao.getUser(id);
    }

    @Override
    public String userEx(String id) {
        String str = execute(id,"userService","get");
        return str;
    }

    public String dubboTest(){
        User user = new User();
        user.setUsername("PUAO");
        String a = execute(user,"userSevice","select");
        return a;
    }
}
