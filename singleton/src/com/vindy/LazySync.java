package com.vindy;

/**
 * 这种方式每个用户都要等待.
 */
public class LazySync {
    private static LazySync singletonSync = null;

    private LazySync(){}

    public static synchronized LazySync getInstance(){
        if(singletonSync == null){
            singletonSync = new LazySync();
        }
        return singletonSync;
    }

}
