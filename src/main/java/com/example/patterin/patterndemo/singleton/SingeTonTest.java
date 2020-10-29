package com.example.patterin.patterndemo.singleton;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author xiaobao.chen
 * Create at 2020-10-29
 */
public class SingeTonTest {

    public static void main(String[] args) {

        SingeTonPattern1 instance = SingeTonPattern1.getInstance();

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 5, 60, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        executor.execute(() -> {
            SingeTonPattern1 instance1 = SingeTonPattern1.getInstance();
            System.out.println(Thread.currentThread() + " " + instance.hashCode() + " " + instance1.hashCode());
            if (instance == instance1) {
                System.out.println("安全");
            } else {
                System.out.println("不安全");
            }
        });

        executor.execute(() -> {
            SingeTonPattern1 instance1 = SingeTonPattern1.getInstance();
            System.out.println(Thread.currentThread() + " " + instance.hashCode() + " " + instance1.hashCode());
            if (instance == instance1) {
                System.out.println("安全");
            } else {
                System.out.println("不安全");
            }
        });
    }
}
