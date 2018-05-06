package com.base.dao.impl;

import com.base.bean.User;
import com.base.dao.BaseDao;
import com.base.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl extends BaseDao implements  UserDao{
    @Autowired
    private UserDao userDao;


    @Override
    public User getUser(String id) {
        User user = new User();
        user.setUserId(id);
        User ss = (User)this.sqlSessionTemplate
                .selectOne("com.base.dao.mapper.UserMapper.selectOne", user);
        return ss;
    }
}
