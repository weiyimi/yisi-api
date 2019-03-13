package com.design.model.proxy.jdk;

import com.design.model.proxy.statics.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理（动态生成对象）
 * 目标对象增加方法，不需要更改代理类
 */
public class MeipoJDKProxy implements InvocationHandler {

    private Person person;

    public Object getInstance(Person person){
        this.person = person;
        Class<?> destClass = person.getClass();
        // 生成一个实现了目标对象的接口的新的对象（通过字节码重组）
        return Proxy.newProxyInstance(destClass.getClassLoader(), destClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始调用方法");
        Long startTime = System.currentTimeMillis();
        method.invoke(person, args);
        System.out.println("调用方法结束 耗时：" + (System.currentTimeMillis() - startTime));
        return null;
    }
}
