package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.Bean;

public abstract class AbstractFactoryBean {

    public void init() {
        // 统一初始化
    }

    abstract Bean getControllerBean();

    abstract Bean getServiceBean();
}
