package com.base.dao;


import com.base.bean.User;

import javax.annotation.Resource;


public interface UserDao {

    public User getUser(String id );
}
