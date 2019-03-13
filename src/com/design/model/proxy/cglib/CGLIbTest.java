package com.design.model.proxy.cglib;

import com.design.model.proxy.statics.Person;
import com.design.model.proxy.statics.Son;

public class CGLIbTest {

    public static void main(String[] args) {
        Person personProxy = (Person) new MeipoCGLIBProxy().getInstance(Son.class);
        personProxy.rentHouse();
    }
}
