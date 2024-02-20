package com.vindy;

public class Director {

    public void construct(Builder builder){
        //业务逻辑
        builder.buildPartA(1);
        builder.buildPartB("my-test");
        builder.buildPartC(2);
    }
}
