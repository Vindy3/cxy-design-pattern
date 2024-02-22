package com.vindy.factorymethod;

public class WeChatFactory implements PayFactory {

    @Override
    public Pay createPay() {
        return new WeChat();
    }
}
