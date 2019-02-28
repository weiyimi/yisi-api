package com.design.model.single.hunger;

import com.design.model.single.hunger.HungerSingle;

public class HungerTest {

    public static void main(String[] args) {
        HungerSingle instance = HungerSingle.getInstance();
        HungerSingle instance1 = HungerSingle.getInstance();
        System.out.println(instance == instance1);
    }
}
