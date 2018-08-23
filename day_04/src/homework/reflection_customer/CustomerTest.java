package homework.reflection_customer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 *  利用反射获取有参构造
 */
public class CustomerTest {
    public static void main(String[] args) throws Exception {
        // 加载类
        Class<?> c = Class.forName("homework.reflection_customer.Customer");

        // 获取构造器
        Constructor<?> constructor = c.getConstructor(String.class, int.class);

        // 初始化构造器

        Object instance = constructor.newInstance("张三", 24);

        // 直接调用toString()方法   法一
        //String s = instance.toString();
        //System.out.println(s);

        // 方法二
        // 利用反射获取到toString()方法
        Method toString1 = c.getMethod("toString");

        // 调用该方法
        Object returnTo = toString1.invoke(instance);

        System.out.println(returnTo);



    }
}
