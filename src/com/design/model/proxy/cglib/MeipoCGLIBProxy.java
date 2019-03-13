package com.design.model.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MeipoCGLIBProxy implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) {
        // 增强器
        Enhancer enhancer = new Enhancer();
        // 生成一个继承了该clazz的对象
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始调用方法");
        Long startTime = System.currentTimeMillis();
        methodProxy.invokeSuper(o, objects);
        System.out.println("调用方法结束 耗时：" + (System.currentTimeMillis() - startTime));
        return null;
    }
}
