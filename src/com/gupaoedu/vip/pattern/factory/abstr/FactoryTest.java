package com.gupaoedu.vip.pattern.factory.abstr;

public class FactoryTest {

    public static void main(String[] args) {
        FactoryBean factoryBean = new FactoryBean();
        // 可以将都会做的事情，统一处理
        factoryBean.init();
        // 抽象工厂模式，不需要配置，且用户使用仅需自己调方法，要什么，拿什么
        factoryBean.getControllerBean();
    }
}
