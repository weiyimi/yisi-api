package com.design.model.proxy.jdk;

import com.design.model.proxy.statics.Person;
import com.design.model.proxy.statics.Son;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JDKTest {

    public static void main(String[] args) throws IOException {
        Person personProxy = (Person) new MeipoJDKProxy().getInstance(new Son());
        personProxy.rentHouse();

        System.out.println(personProxy.getClass());

        // 可以通过反编译工具查看源码(从JVM中把这个class取出来)
        try {
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
