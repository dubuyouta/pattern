package com.example.patterin.patterndemo.prototype;

/**
 * 针对于八大基本数据类型。通过原型模式 ，实现完全的复制。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class UserTest {

    public static void main(String[] args) throws CloneNotSupportedException {

        User user = new User();
        user.setAge(12);
        user.setHeight(170);

        User userClone = (User) user.clone();

        System.out.println(user);
        System.out.println(userClone);
        System.out.println(user == userClone);
    }
}
