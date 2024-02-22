package com.vindy.factorymethod;

public class ZhiFuBao implements Pay {
    @Override
    public void pay() {
        System.out.println("创建支付宝支付");
    }
}
