package com.vindy;

/**
 * 静态内部类实现单例模式
 */
public class StaticInnerClassSingleton {

    //私有构造方法
    private StaticInnerClassSingleton(){

    }

    //创建一个私有的静态内部类，并且再内部定义一个外部类的静态成员
    private static class SingletonHolder{
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    //提供一个public的方法获取外部类的对象
    public static final StaticInnerClassSingleton getInstance(){
        return SingletonHolder.SINGLETON;
    }
}
