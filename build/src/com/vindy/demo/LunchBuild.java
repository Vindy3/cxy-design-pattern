package com.vindy.demo;

/**
 * 抽象构建接口，定义午餐的行为
 */
public interface LunchBuild {
    void buildName();
    void buildFood();
    void buildTime();
    Lunch buildLunch();
}
