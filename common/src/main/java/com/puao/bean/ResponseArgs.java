package com.puao.bean;

public class ResponseArgs<T>  {
    private Boolean success = Boolean.valueOf(false);
    private Integer code = Integer.valueOf(0);
    private String message = "Error in process";
    private Long timeLength;
    private T data;

    public Boolean getSuccess()
    {
        return this.success;
    }

    public void setSuccess(Boolean success)
    {
        this.success = success;
    }

    public Integer getCode()
    {
        return this.code;
    }

    public void setCode(Integer code)
    {
        this.code = code;
    }

    public String getMessage()
    {
        return this.message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public T getData()
    {
        return (T)this.data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public Long getTimeLength()
    {
        return this.timeLength;
    }

    public void setTimeLength(Long timeLength)
    {
        this.timeLength = timeLength;
    }
}
