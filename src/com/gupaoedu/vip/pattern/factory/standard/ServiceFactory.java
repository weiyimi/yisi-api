package com.gupaoedu.vip.pattern.factory.standard;

import com.gupaoedu.vip.pattern.factory.Bean;
import com.gupaoedu.vip.pattern.factory.ServiceBean;

public class ServiceFactory implements Factory {
    @Override
    public Bean getBean() {
        return new ServiceBean();
    }
}
