package com.vindy.demo;

public class Yuxiangrousi implements LunchBuild{

    private Lunch lunch = new Lunch();

    @Override
    public void buildName() {
        lunch.setName("鱼香肉丝");
    }

    @Override
    public void buildFood() {
        lunch.setFood("里脊肉、萝卜丝、蒜苔、木耳丝");
    }

    @Override
    public void buildTime() {
        lunch.setTime(10L);
    }

    @Override
    public Lunch buildLunch() {
        return lunch;
    }
}
