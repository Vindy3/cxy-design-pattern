package com.vindy.abstractfactory;

public class HuWeiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public Watches createWatches() {
        return new HuaWeiWatches();
    }
}
