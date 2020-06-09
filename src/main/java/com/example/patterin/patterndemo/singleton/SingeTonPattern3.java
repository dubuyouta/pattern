package com.example.patterin.patterndemo.singleton;

/**
 * 懒汉式lazy:调用的时候才加载返回
 *
 * 存在线程安全问题
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern3 {

    private static SingeTonPattern3 singeTonPattern = null;

    public SingeTonPattern3() {
    }

    public static SingeTonPattern3 getInstance() {
        if (singeTonPattern == null) {
            singeTonPattern = new SingeTonPattern3();
        }
        return singeTonPattern;
    }
}
