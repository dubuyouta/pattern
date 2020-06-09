package com.example.patterin.patterndemo.prototype;

/**
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class User implements Cloneable{

    private int age;

    private long height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
