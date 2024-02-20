package com.vindy;

/**
 * 枚举方式创建单例：
 * 1.保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）
 * 2.线程安全
 */
public enum EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
