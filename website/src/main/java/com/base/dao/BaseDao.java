package com.base.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseDao {

    @Resource(name="sqlSessionTemplate")
    protected SqlSessionTemplate sqlSessionTemplate;
}
