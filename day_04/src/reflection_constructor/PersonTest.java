package reflection_constructor;

import java.lang.reflect.Constructor;

public class PersonTest {
    public static void main(String[] args) throws Exception{
        Class<?> c = Class.forName("reflection_constructor.Person");

        Constructor<?> constructor = c.getConstructor(String.class, int.class);

        // newInstance 默认只能调用无参构造器 如果没有会报异常
        // 如果想用有参的，需要先通过getConstructor()方法获取特定的构造器
        // 通过构造器对象.newInstance() 获取实例
        Object instance = constructor.newInstance("张三", 23);

        String s = instance.toString();

        System.out.println(s);
    }
}
