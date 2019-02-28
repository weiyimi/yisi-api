package com.design.model.factory.simple;

import java.util.concurrent.CountDownLatch;

public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        // 需要用户自行输入name，很容易出错
        System.out.println(factory.getBean("controller").getName());

        CountDownLatch latch = new CountDownLatch(10);
        while (latch.getCount() > 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(latch.getCount());
                    latch.countDown();
                    try {
                        latch.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(System.currentTimeMillis());
                }
            }).start();
        }

    }
}
