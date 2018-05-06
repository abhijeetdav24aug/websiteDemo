package com.base.bean;

public class User {

    private String userId;

    private String username;

    private String userPsw;

    private Integer userAge;

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserPsw() {
        return userPsw;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserPsw(String userPsw) {
        this.userPsw = userPsw;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return userId +":"+username+":"+userAge;
    }
}
