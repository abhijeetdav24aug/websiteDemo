package com.puao.bean;

public class RequestArgs<T> {

    private String interfaceName;
    private String methodName;
    private T data;

    public String getInterfaceName()
    {
        return this.interfaceName;
    }

    public void setInterfaceName(String interfaceName)
    {
        this.interfaceName = interfaceName;
    }

    public String getMethodName()
    {
        return this.methodName;
    }

    public void setMethodName(String methodName)
    {
        this.methodName = methodName;
    }

    public T getData()
    {
        return (T)this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }
}
