package com.vindy.factorymethod;

public class WeChat implements Pay {
    @Override
    public void pay() {
        System.out.println("创建微信支付");
    }
}
