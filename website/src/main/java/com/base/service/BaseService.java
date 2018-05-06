package com.base.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.puao.bean.RequestArgs;
import com.puao.bean.ResponseArgs;
import com.puao.datamodel.ICommonInterface;

import javax.annotation.Resource;

public class BaseService
{
    @Resource(name="commonInterface")
    protected ICommonInterface commonInterface;

    protected <T, V> String execute(T data, String interfaceName, String funcName)
    {
        RequestArgs<T> requestVo = new RequestArgs<>();
        requestVo.setData(data);
        requestVo.setInterfaceName(interfaceName);
        requestVo.setMethodName(funcName);

        String resultStr = this.commonInterface.execute(JSON.toJSONString(requestVo));
        ResponseArgs<V> result = (ResponseArgs)JSON.parseObject(resultStr, new TypeReference() {}, new Feature[0]);
        if (result.getData() != null) {
            return result.getData().toString();
        }
        return null;
    }

    protected <T> String executeForJson(T data, String interfaceName, String funcName)
    {
        RequestArgs<T> requestVo = new RequestArgs();
        requestVo.setData(data);
        requestVo.setInterfaceName(interfaceName);
        requestVo.setMethodName(funcName);

        String resultStr = this.commonInterface.execute(JSON.toJSONString(requestVo));
        return resultStr;
    }
}
