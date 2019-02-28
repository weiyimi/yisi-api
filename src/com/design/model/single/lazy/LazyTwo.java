package com.design.model.single.lazy;

public class LazyTwo {

    private static LazyTwo lazyTwo;

    private LazyTwo() {

    }

    public synchronized static LazyTwo getInstance(){
        if (lazyTwo == null) {
            lazyTwo = new LazyTwo();
        }
        return lazyTwo;
    }

}
