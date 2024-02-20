package com.vindy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试单例
 */
public class SingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();

        Constructor constructor = Singleton.class.getDeclaredConstructor( null);
        constructor.setAccessible(true);
        Singleton singleton2 = (Singleton) constructor.newInstance(null);
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
