package com.design.model.single.hunger;

import java.io.Serializable;

/**
 * 饥饿式单例
 */
public class HungerSingle implements Serializable {

    private static final HungerSingle HUNGER_SINGLE = new HungerSingle();

    private static boolean isCreate;

    private HungerSingle() {
        if (!isCreate) {
            isCreate = true;
        } else {
            throw new RuntimeException("单例被侵犯");
        }
    }

    public static HungerSingle getInstance() {
        return HUNGER_SINGLE;
    }

    /**
     * 解决序列化readObject会破坏单例的方法
     */
    private Object readResolve(){
        return HUNGER_SINGLE;
    }
}
