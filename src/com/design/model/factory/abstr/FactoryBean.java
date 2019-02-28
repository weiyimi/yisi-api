package com.design.model.factory.abstr;

import com.design.model.factory.Bean;
import com.design.model.factory.ControllerBean;
import com.design.model.factory.ServiceBean;

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
