package com.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 账户的实体类
 */
public class Account2 implements Serializable {
    private String username;
    private String password;
    private Double money;

    private List<User> userList;
    private Map<String,User> userMap;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account2{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", userList=" + userList +
                ", userMap=" + userMap +
                '}';
    }
}
