package com.vindy.demo;

/**
 * 厨师
 */
public class Cook {
    private LunchBuild lunchBuild;

    public Cook(LunchBuild lunchBuild) {
        this.lunchBuild = lunchBuild;
    }

    public Lunch accomplish(){
        lunchBuild.buildName();
        lunchBuild.buildFood();
        lunchBuild.buildTime();
        return lunchBuild.buildLunch();
    }

}
