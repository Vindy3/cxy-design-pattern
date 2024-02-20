package com.vindy;

/**
 * 懒汉式：判断对象为null时创建对象。这种方法并发时会有问题。
 */
public class Lazy {
    private static Lazy singleton;

    private Lazy(){}

    public static Lazy getInstance(){
        if(singleton == null){
            singleton = new Lazy();
        }
        return singleton;
    }
}
