package com.gupaoedu.vip.pattern.factory.simple;

public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        // 需要用户自行输入name，很容易出错
        System.out.println(factory.getBean("controller").getName());
    }
}
