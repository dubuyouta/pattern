package com.example.patterin.patterndemo.factory.factorymethod;

/**
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
