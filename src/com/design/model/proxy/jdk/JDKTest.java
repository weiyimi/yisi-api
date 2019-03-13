package com.design.model.proxy.jdk;

import com.design.model.proxy.statics.Person;
import com.design.model.proxy.statics.Son;

public class JDKTest {

    public static void main(String[] args) {
        Person personProxy = (Person) new MeipoJDKProxy().getInstance(new Son());
        personProxy.rentHouse();
    }
}
