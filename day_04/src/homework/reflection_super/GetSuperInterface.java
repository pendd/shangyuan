package homework.reflection_super;

import java.lang.reflect.Type;

/**
 *  获取Set的父接口
 */
public class GetSuperInterface {
    public static void main(String[] args) throws Exception {
        // 加载类
        Class<?> c = Class.forName("java.util.HashSet");

        // 获取父接口
        Class<?>[] interfaces = c.getInterfaces();

        // 遍历接口数组
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getSimpleName());
        }

        System.out.println("===================");

        /*Type[] genericInterfaces = c.getGenericInterfaces();
        for (Type genericInterface : genericInterfaces) {
            System.out.println(genericInterface.getTypeName());
        }*/

    }
}
