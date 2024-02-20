package com.vindy.clone;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton2 = (Singleton) singleton.clone();
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());

    }
}
