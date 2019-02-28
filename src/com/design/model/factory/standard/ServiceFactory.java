package com.design.model.factory.standard;

import com.design.model.factory.Bean;
import com.design.model.factory.ServiceBean;

public class ServiceFactory implements Factory {
    @Override
    public Bean getBean() {
        return new ServiceBean();
    }
}
