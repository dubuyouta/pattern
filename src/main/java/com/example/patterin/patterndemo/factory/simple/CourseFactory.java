package com.example.patterin.patterndemo.factory.simple;

/**
 * 简单的工厂模式
 *
 * @author xiaobao.chen
 * Create at 2020-06-09
 */
public class CourseFactory {

    /**
     * 通过类型实现对象的创建
     *
     * @param typeName
     * @return
     */
    public ICourse create(String typeName) {
        if (typeName.equals("java")) {
            return new JavaCourse();
        } else if (typeName.equals("python")) {
            return new PythonCourse();
        } else {
            return null;
        }
    }

    /**
     * 通过反射实现对象的创建
     *
     * @param className
     * @return
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public ICourse createForClassName(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (ICourse) Class.forName(className).newInstance();
    }

    /**
     * 通过class 类型 解决 通过字符串可能出现的拼写错误的问题
     *
     * @param clazz
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public ICourse create(Class clazz) throws IllegalAccessException, InstantiationException {
        return (ICourse) clazz.newInstance();
    }

    /**
     * 通过泛型解决类型强制转换的问题
     *
     * @param clazz
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public ICourse create2(Class<? extends ICourse> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }
}
