package com.design.model.proxy.statics;

public class StaticTest {

    public static void main(String[] args) {
        // 静态代理，适合已经确定好的目标
        // 因为如果要做拓展的话，目标对象增加一个方法，
        // 还得更改Meipo代理类，不智能
        MeiPoProxy meiPo = new MeiPoProxy(new Son());
        meiPo.findLove();
    }
}
