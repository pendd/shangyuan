package homework.reflection_super;


import java.lang.reflect.Type;

/**
 * 利用反射获取SimpleDateFormat的父类
 */
public class GetSuperClass {
    public static void main(String[] args) throws Exception {
        Class<?> c = Class.forName("java.text.SimpleDateFormat");

        Class<?> superclass = c.getSuperclass();

        System.out.println(superclass.getSimpleName());

        // 结果为java.text.DateFormat
        /*Type genericSuperclass = c.getGenericSuperclass();

        System.out.println(genericSuperclass.getTypeName());*/
    }
}
