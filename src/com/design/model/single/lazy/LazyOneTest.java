package com.design.model.single.lazy;

import java.util.concurrent.CountDownLatch;

public class LazyOneTest {

    public static void main(String[] args) {
        // 会有线程安全的问题
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(()-> {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LazyOne instance = LazyOne.getInstance();
                System.out.println(instance);
            }).start();
            countDownLatch.countDown();
        }
    }
}
