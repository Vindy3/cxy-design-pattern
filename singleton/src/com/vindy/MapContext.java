package com.vindy;

import java.util.HashMap;
import java.util.Map;
public class MapContext {
    private static final ThreadLocal<MapContext> local = new
            ThreadLocal<>();

    private Map<String,Object> data = new HashMap<>();
    public Map<String, Object> getData() {
        return getAppContext().data;
    }
    //批量存数据
    public void setData(Map<String, Object> data){
        getAppContext().data.putAll(data);
    }
    //存数据
    public void set(String key, String value) {
        getAppContext().data.put(key,value);
    }
    //取数据
    public void get(String key) {
        getAppContext().data.get(key);
    }
    //初始化的实现⽅法
    private static MapContext init(){
        MapContext context = new MapContext();
        local.set(context);
        return context;
    }
    //做延迟初始化
    public static MapContext getAppContext(){
        MapContext context = local.get();
        if (null == context) {
            context = init();
        }
            return context;
    }
        //删除实例
        public static void remove() {
            local.remove();
        }
}