package com.design.model.single.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 */
public class IocMap {

    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public Object getInstance(String className){
        if (ioc.containsKey(className)) {
            return ioc.get(className);
        } else {
            try {
                ioc.put(className, Class.forName(className).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
