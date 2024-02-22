package com.vindy.factorymethod;

public class ZhiFuBaoFactory implements PayFactory {

    @Override
    public Pay createPay() {
        return new ZhiFuBao();
    }
}
