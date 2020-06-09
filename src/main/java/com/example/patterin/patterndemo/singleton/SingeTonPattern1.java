package com.example.patterin.patterndemo.singleton;

/**
 * 饿汉式单例模式：静态属性
 * 类加载的时候 已经存在，不存在线程安全问题。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern1 {

    private static final SingeTonPattern1 singeTonPattern1 = new SingeTonPattern1();

    public SingeTonPattern1() {
    }

    public static SingeTonPattern1 getInstance() {
        return singeTonPattern1;
    }
}
