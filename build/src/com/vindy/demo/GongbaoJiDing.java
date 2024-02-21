package com.vindy.demo;

public class GongbaoJiDing implements LunchBuild{

    private Lunch lunch = new Lunch();

    @Override
    public void buildName() {
        lunch.setName("宫保鸡丁");
    }

    @Override
    public void buildFood() {
        lunch.setFood("鸡腿肉、葱姜蒜、豆瓣酱、花生、白糖");
    }

    @Override
    public void buildTime() {
        lunch.setTime(15L);
    }

    @Override
    public Lunch buildLunch() {
        return lunch;
    }
}
