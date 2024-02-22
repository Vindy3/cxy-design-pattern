package com.vindy.abstractfactory;

public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new XiaoMiPhone();
    }

    @Override
    public Watches createWatches() {
        return new XiaoMiWatches();
    }
}
