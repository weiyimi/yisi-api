package com.design.model.single.lazy;

public class LazyThree {

    private static boolean isCreate = false;

    private LazyThree(){
        // 防止反射破坏单例
        synchronized (LazyThree.class) {
            // 未创建
            if (isCreate) {
                throw new RuntimeException("单例被侵犯");
            } else {
                isCreate = true;
            }
        }
    }

    public static LazyThree getInstance(){
        return LazyThreeHolder.LAZY_THREE;
    }

    /**
     * 内部类只有在外部类方法调用时初始化
     * 所以既可以解决耗内存的问题又可以解决性能问题
     */
    private static class LazyThreeHolder {
        private static final LazyThree LAZY_THREE = new LazyThree();
    }
}
