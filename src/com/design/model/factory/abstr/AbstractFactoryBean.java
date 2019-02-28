package com.design.model.factory.abstr;

import com.design.model.factory.Bean;

public abstract class AbstractFactoryBean {

    public void init() {
        // 统一初始化
    }

    abstract Bean getControllerBean();

    abstract Bean getServiceBean();
}
