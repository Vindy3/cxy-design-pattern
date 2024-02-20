package com.vindy.clone;


public class Singleton implements Cloneable{
    private static int num = 0;
    private volatile static Singleton singleton;

    //private Singleton(){}

    private Singleton(){
        System.out.println("构造方法被调用了");
        synchronized (com.vindy.reflect.Singleton.class){
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
