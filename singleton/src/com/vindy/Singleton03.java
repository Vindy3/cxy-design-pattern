package com.vindy;

/**
 * 饿汉式的第三种方式
 */
public class Singleton03 {
    private static  Singleton03 instance = null;

    static {
        instance = new Singleton03();
    }

    private Singleton03(){}

    public static Singleton03 getInstance(){
        return instance;
    }
}
