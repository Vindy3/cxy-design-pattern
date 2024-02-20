package com.vindy.reflect;


public class Singleton {

    private static int num = 0;

    private volatile static Singleton singleton;

    private Singleton(){
        System.out.println("构造方法被调用了");
        synchronized (Singleton.class){
            if(num == 0){
                num++;
            }else {
                throw new RuntimeException("构造方法被调用了多次");
            }
        }
    }

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
