package com.design.model.proxy.statics;

/**
 * 代理类
 */
public class MeiPoProxy implements Person{

    /**
     * 目标对象
     */
    private Person person;

    public MeiPoProxy(Person person) {
        this.person = person;
    }

    @Override
    public void findLove() {
        System.out.println("获取需求");
        person.findLove();
        System.out.println("成了");
    }

    @Override
    public void rentHouse() {
        System.out.println("获取需求");
        person.findLove();
        System.out.println("一手交钱一手交房");
    }
}
