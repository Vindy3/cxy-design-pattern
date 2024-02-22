package com.vindy.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        //1.测试晨光
        AbstractFactory factory = new HuWeiFactory();
        Phone phone = factory.createPhone();
        phone.call();
        Watches eraser = factory.createWatches();
        eraser.time();


        //2.测试真彩
        AbstractFactory factory1 = new XiaoMiFactory();
        Phone phone1 = factory1.createPhone();
        phone1.call();
        Watches eraser1 = factory1.createWatches();
        eraser1.time();
    }
}
