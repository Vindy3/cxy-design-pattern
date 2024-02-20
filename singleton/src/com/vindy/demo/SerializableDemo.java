package com.vindy.demo;

import java.io.*;

/**
 * 序列化破坏单例模式
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton);

        //给文件中写数据
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));

        oos.writeObject(Singleton.getSingleton());

        //读取对象
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton singletonSer = (Singleton) ois.readObject();

        System.out.println(singletonSer == singleton); //false
    }
}
