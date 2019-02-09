package com.gupaoedu.vip.pattern.factory.standard;

import com.gupaoedu.vip.pattern.factory.Bean;
import com.gupaoedu.vip.pattern.factory.ControllerBean;

public class ControllerFactory implements Factory {
    @Override
    public Bean getBean() {
        return new ControllerBean();
    }
}
