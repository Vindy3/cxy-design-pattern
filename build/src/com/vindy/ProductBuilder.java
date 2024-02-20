package com.vindy;

public class ProductBuilder implements Builder{
    private int partA;
    private String partB;
    private int partC;

    @Override
    public void buildPartA(int partA) {
        //业务过程一
        this.partA = partA;
    }

    @Override
    public void buildPartB(String partB) {
        //业务过程二
        this.partB = partB;
    }

    @Override
    public void buildPartC(int partC) {
        //业务过程三
        this.partC = partC;
    }

    @Override
    public Product getResult() {
        return new Product(partA,partB,partC);
    }
}
