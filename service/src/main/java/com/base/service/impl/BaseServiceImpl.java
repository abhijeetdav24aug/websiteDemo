package com.base.service.impl;

import com.alibaba.fastjson.JSON;
import com.puao.bean.ResponseArgs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseServiceImpl {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    protected String errorResult(String msg) {
        ResponseArgs<String> responseVo = new ResponseArgs();
        responseVo.setCode(Integer.valueOf(0));
        responseVo.setMessage(msg);
        responseVo.setSuccess(Boolean.valueOf(false));

        return JSON.toJSONString(responseVo);
    }

    protected <T> String successResult(T data, String msg) {
        ResponseArgs<T> responseVo = new ResponseArgs();
        responseVo.setCode(Integer.valueOf(1));
        responseVo.setMessage(msg);
        responseVo.setSuccess(Boolean.valueOf(true));
        responseVo.setData(data);

        return JSON.toJSONString(responseVo);
    }
}
