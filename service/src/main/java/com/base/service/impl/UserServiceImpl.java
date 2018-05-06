package com.base.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.base.bean.User;
import com.base.dao.UserDao;
import com.base.service.UserService;
import com.puao.bean.RequestArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl extends BaseServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public String service(String param) {
        RequestArgs<?> requestVo = (RequestArgs)JSON.parseObject(param, RequestArgs.class);

        if ((requestVo.getMethodName() == null) ||
                ("".equals(requestVo.getMethodName()))) {
            return errorResult("Not found the function");
        }
        if ("get".equals(requestVo.getMethodName())) {

            return getUser(JSON.toJSONString(requestVo.getData()));
        }
        return errorResult("Not exist the function");
    }

    @Override
    public String getUser(String id) {

        User user = userDao.getUser(StringUtils.isBlank(id)? "1" :id);
        user.setUsername("puao");
        return user.toString();
    }
}
