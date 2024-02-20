package com.vindy;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton01 instance = Singleton01.INSTANCE;
        Singleton01 instance1 = Singleton01.INSTANCE;
        System.out.println(instance1 == instance);

        System.out.println("---------------------");
        Singleton02 instance02 = Singleton02.getInstance();
        Singleton02 instance02_1 = Singleton02.getInstance();
        System.out.println(instance02 == instance02_1);

        System.out.println("---------------------");
        Singleton03 instance03 = Singleton03.getInstance();
        Singleton03 instance03_1 = Singleton03.getInstance();
        System.out.println(instance03 == instance03_1);
    }
}
