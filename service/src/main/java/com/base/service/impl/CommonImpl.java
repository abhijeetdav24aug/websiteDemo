package com.base.service.impl;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.fastjson.JSON;
import com.base.service.UserService;
import com.puao.bean.RequestArgs;
import com.puao.bean.ResponseArgs;
import com.puao.datamodel.ICommonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("commonInterface")
public class CommonImpl implements ICommonInterface {

    @Autowired
    private UserService userService;

    @Override
    public String execute(String json) {
        RequestArgs<?> requestVo = (RequestArgs) JSON.parseObject(json, RequestArgs.class);
        if (StringUtils.isBlank(requestVo.getInterfaceName())) {
            return errorResult("Not found the functuion!");
        }
        if (requestVo.getInterfaceName().equals("userService")) {
            String result = this.userService.service(json);
            return result;
        }
        return errorResult("Not found the interface");
    }

    private String errorResult(String msg) {
        ResponseArgs<String> responseVo = new ResponseArgs();
        responseVo.setCode(Integer.valueOf(0));
        responseVo.setMessage(msg);
        responseVo.setSuccess(Boolean.valueOf(false));
        return JSON.toJSONString(responseVo);
    }

}
