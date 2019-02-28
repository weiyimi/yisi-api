package com.design.model.factory.simple;

import com.design.model.factory.ControllerBean;
import com.design.model.factory.ServiceBean;
import com.design.model.factory.Bean;

public class Factory {

    public Bean getBean(String name) {
        // 不利于拓展，且经常需要修改
        if ("controller".equals(name)) {
            return new ControllerBean();
        } else if ("service".equals(name)) {
            return new ServiceBean();
        } else {
            return null;
        }
    }
}
