package com.vindy;

public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ProductBuilder();
        director.construct(builder);
        Product product = builder.getResult();
        System.out.println(product);
    }
}
