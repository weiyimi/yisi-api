package com.design.model.single.lazy;

/**
 * 懒汉式单例
 */
public class LazyOne {

    private static LazyOne lazyOne;

    private LazyOne(){

    }

    public static LazyOne getInstance(){
        if (lazyOne == null) {
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

}
