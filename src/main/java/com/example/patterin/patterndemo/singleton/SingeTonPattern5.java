package com.example.patterin.patterndemo.singleton;

/**
 * 懒汉式lazy:调用的时候才加载返回
 * <p>
 * 通过synchronized 解决线程安全问题。不过锁的是代码块，不是方法，减少锁的竞争带来的损耗。
 * 双重锁校验的目的：减少锁得竞争。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class SingeTonPattern5 {

    private static SingeTonPattern5 singeTonPattern = null;

    public SingeTonPattern5() {
    }

    public static SingeTonPattern5 getInstance() {
        if (singeTonPattern == null) {
            synchronized (SingeTonPattern5.class) {
                if (singeTonPattern == null) {
                    singeTonPattern = new SingeTonPattern5();
                }
            }
        }
        return singeTonPattern;
    }
}
