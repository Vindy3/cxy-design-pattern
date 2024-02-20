package com.vindy;

public interface Builder {
    void buildPartA(int partA);
    void buildPartB(String partB);
    void buildPartC(int partC);
    Product getResult();

}
