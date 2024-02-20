package com.vindy;

/**
 * 解决问题： 懒加载+synchronized的效率问题
 * 解决方案： 双重校验
 *
 * volatile:
 * java编译器会允许处理器乱序执行，volatile进制重排序
 * JDK大于1.5
 */
public class DCLLazy {
    private static volatile DCLLazy singleton;

    private DCLLazy(){}

    public static DCLLazy getInstance(){
        if(singleton == null){ //第一次判断，避免不必要的同步（提高效率）
            synchronized (DCLLazy.class){  //同步
                if(singleton == null){ //第二次判断，保证线程安全
                    singleton = new DCLLazy();
                }
            }
        }
        return singleton;
    }
}
