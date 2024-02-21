package com.vindy.demo;

/**
 * 厨房
 */
public class Demo {

    public static void main(String[] args) {
        //大厨做饭的时候都会有助手准备好食材。厨师今天准备做宫保鸡丁和鱼香肉丝。
        //助手开始准备食材
        GongbaoJiDing gongbaoJiDing = new GongbaoJiDing();
        Yuxiangrousi yuxiangrousi = new Yuxiangrousi();
        //食材准备完毕，大厨开始做菜
        Cook cookG = new Cook(gongbaoJiDing);
        //第一道菜宫保鸡丁
        Lunch g = cookG.accomplish();
        System.out.println(g);
        //第二道菜鱼香肉丝
        Cook cookY = new Cook(yuxiangrousi);
        Lunch y = cookY.accomplish();
        System.out.println(y);
    }
}
