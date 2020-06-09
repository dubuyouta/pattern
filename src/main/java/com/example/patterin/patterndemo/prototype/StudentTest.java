package com.example.patterin.patterndemo.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 对于克隆对象中的其它类型，进行克隆时，进行的是浅克隆。（复制的不是值，是引用地址。）
 * 深克隆：通过序列化和反序列化实现。
 *
 * https://blog.csdn.net/qq_40709468/article/details/82316418
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class StudentTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setAge(12);
        user.setHeight(170);

        User user1 = new User();
        user.setAge(13);
        user.setHeight(177);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(user1);

        Student student = new Student();
        student.setUserList(userList);
        student.setName("test1");

        Student student1 = (Student) student.clone();

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student1==student);
        System.out.println(student1.getUserList()==student.getUserList());
        System.out.println(student.getName() == student1.getName());

        User user2 = new User();
        user.setAge(14);
        user.setHeight(178);
        student1.getUserList().add(user2);

        System.out.println(student.getUserList().size());
    }
}
