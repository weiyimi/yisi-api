package com.design.model.single.lazy;

public class LazyThreeTest {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 222222222; i++) {
            LazyThree instance = LazyThree.getInstance();
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
