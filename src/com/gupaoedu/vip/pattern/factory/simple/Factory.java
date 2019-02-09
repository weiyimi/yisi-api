package com.gupaoedu.vip.pattern.factory.simple;

import com.gupaoedu.vip.pattern.factory.Bean;
import com.gupaoedu.vip.pattern.factory.ControllerBean;
import com.gupaoedu.vip.pattern.factory.ServiceBean;

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
