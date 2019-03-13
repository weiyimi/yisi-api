package com.design.model.proxy.custom;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.nio.charset.Charset;

/**
 * 自定义的代理类
 * @author weiys
 * @since 2019/03/13 13:13
 */
public class YSProxy {

    /**
     * 我们可以自定义一个代理类，手动写出动态代理
     * @author weiys
     * @since 2019/03/13 13:14
     * @param loader 类加载器
     * @param interfaces 接口
     * @param h 调用
     * @return java.lang.Object
     */
    public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        try {
            // 1.生成java源文件
            String src = generateSrc(interfaces);
            // 2.java文件输出到磁盘
            String path = YSProxy.class.getResource("").getPath();
            File file = new File(path + "$Proxy0.java");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(src);
            fileWriter.flush();
            fileWriter.close();
            // 3.编译成.class文件
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);
            Iterable<? extends JavaFileObject> iterable = manager.getJavaFileObjects(file);
            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();
            manager.close();
            // 4.加载到JVM中
            Class<?> clazz = loader.loadClass("$Proxy0");
            Constructor<?> constructor = clazz.getConstructor(h.getClass());
            // 5.返回字节码重组的代理对象
            return constructor.newInstance(h);
        } catch (Throwable e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 生成源文件（生成一个实现该参数接口的源文件）
     * @author weiys
     * @since 2019/03/13 13:48
     * @param interfaces 所有接口
     * @return java.lang.String
     */
    private static String generateSrc(Class<?>[] interfaces) {
        StringBuffer sb = new StringBuffer();
        sb.append("pack****");
        sb.append("import***");
        return sb.toString();
    }
}
