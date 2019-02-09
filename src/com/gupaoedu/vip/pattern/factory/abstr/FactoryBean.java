package com.gupaoedu.vip.pattern.factory.abstr;

import com.gupaoedu.vip.pattern.factory.Bean;
import com.gupaoedu.vip.pattern.factory.ControllerBean;
import com.gupaoedu.vip.pattern.factory.ServiceBean;

public class FactoryBean extends AbstractFactoryBean {
    @Override
    Bean getControllerBean() {
        return new ControllerBean();
    }

    @Override
    Bean getServiceBean() {
        return new ServiceBean();
    }
}
