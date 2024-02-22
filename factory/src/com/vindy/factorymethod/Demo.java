package com.vindy.factorymethod;

public class Demo {
    public static void main(String[] args) {
        Pay pay = new WeChatFactory().createPay();
        pay.pay();
        Pay pay1 = new ZhiFuBaoFactory().createPay();
        pay1.pay();
    }
}
