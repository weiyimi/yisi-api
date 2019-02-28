package com.design.model.factory.standard;

import com.design.model.factory.Bean;
import com.design.model.factory.ControllerBean;

public class ControllerFactory implements Factory {
    @Override
    public Bean getBean() {
        return new ControllerBean();
    }
}
