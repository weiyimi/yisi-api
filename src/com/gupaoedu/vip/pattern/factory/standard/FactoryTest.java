package com.gupaoedu.vip.pattern.factory.standard;

public class FactoryTest {

    public static void main(String[] args) {
        // 获取controller的bean
        Factory factory = new ControllerFactory();
        factory.getBean().getName();

        // 缺点在于，需要通过配置才知道，有什么工厂可以用，很容易出错
        // 拓展性不好，每加一个工厂，都需要再加一个。
    }
}
