package com.vindy.abstractfactory;

public class HuaWeiWatches implements Watches {
    @Override
    public void time() {
        System.out.println("华为手表看时间");
    }
}
