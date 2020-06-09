package com.example.patterin.patterndemo.singleton;

/**
 * 懒汉式lazy:调用的时候才加载返回
 * <p>
 * 通过synchronized 解决线程安全问题。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern4 {

    private static SingeTonPattern4 singeTonPattern = null;

    public SingeTonPattern4() {
    }

    public synchronized static SingeTonPattern4 getInstance() {
        if (singeTonPattern == null) {
            singeTonPattern = new SingeTonPattern4();
        }
        return singeTonPattern;
    }
}
