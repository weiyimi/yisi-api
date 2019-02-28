package com.design.model.single.lazy;

public class LazyTwoTest {

    public static void main(String[] args) {
        // 会有性能问题
        long start = System.currentTimeMillis();
        for (int i = 0; i < 222222222; i++) {
            LazyTwo instance = LazyTwo.getInstance();
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
