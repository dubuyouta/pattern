package com.example.patterin.patterndemo.singleton;

/**
 *
 * 通过静态内部类的方式实现单例。
 * 优点：线程安全。还可以防止序列化和反序列化 带来的问题。
 * 原因：https://blog.csdn.net/mnb65482/article/details/80458571
 * 1.静态内部类加载的方式：被动加载
 * 2.类加载器对类的加载时，cinit 方法保证只能有一个线程调用成功。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern6 {

    public SingeTonPattern6() {
    }

    public static SingeTonPattern6 getInstance() {
        return SingleTon.singeTonPattern;
    }

    private static class SingleTon {

        private static final SingeTonPattern6 singeTonPattern = new SingeTonPattern6();
    }
}
