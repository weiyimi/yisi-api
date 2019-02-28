package com.design.model.single.serialize;

import com.design.model.single.hunger.HungerSingle;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 序列化单例会破坏单例，因为readObject每次都会创建一个新的对象
 * 所以需要去重写readResolve方法，让readObject返回原对象
 */
public class SerializeSingle {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HungerSingle hungerSingle = HungerSingle.getInstance();
        System.out.println(hungerSingle);
        ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(hungerSingle);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.getBytes());
        ObjectInputStream ois = new ObjectInputStream(bis);
        HungerSingle hungerSingle1 = (HungerSingle)ois.readObject();
        System.out.println(hungerSingle1);

    }

}
