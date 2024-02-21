package com.vindy.demo;

/**
 * 中午饭
 */
public class Lunch {

    /*
     * 名称
     */
    private String name;
    /*
     * 食材
     */
    private String food;
    /*
     * 烹饪时常
     */
    private Long time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Lunch{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", time=" + time +
                '}';
    }
}
