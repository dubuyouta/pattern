package com.example.patterin.patterndemo.factory.factorymethod;

/**
 * 工厂方法模式：对工厂方法进行抽象。由子类自己去实现。
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public interface ICourseFactory {

    ICourse create();
}
