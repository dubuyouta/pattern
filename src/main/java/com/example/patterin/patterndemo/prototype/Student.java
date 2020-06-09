package com.example.patterin.patterndemo.prototype;

import java.util.List;

/**
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class Student implements Cloneable {

    private String name;

    private List<User> userList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
