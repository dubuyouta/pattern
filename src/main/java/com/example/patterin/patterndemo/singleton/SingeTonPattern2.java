package com.example.patterin.patterndemo.singleton;

/**
 * 饿汉式单例模式:通过静态块实现。
 * 类加载的时候 已经存在，不存在线程安全问题。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern2 {

    private static final SingeTonPattern2 singeTonPattern1;

    static {
        singeTonPattern1 = new SingeTonPattern2();
    }

    public SingeTonPattern2() {
    }

    public static SingeTonPattern2 getInstance() {
        return singeTonPattern1;
    }
}
