package com.vindy;

/**
 * 第一种单例模式 （饿汉式）
 * @author cxy
 * 1.构造方法私有化
 * 2.声明一个本类的成员，静态的，已经初始化好的
 * 3.饿汉式 依赖jvm在类装载时就完对象实例化，基于类加载的机制，天生就是线程安全的。
 */
public class Singleton01 {

    public static final Singleton01 INSTANCE = new Singleton01();

    private Singleton01(){}
}
