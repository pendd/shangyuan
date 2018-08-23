package reflection_login;

import java.lang.reflect.Method;

public class UserServiceTest {
    /*
     *  用反射方式实现验证登录操作
     */
    public static void main(String[] args) throws Exception {
        // 加载类
        Class<?> c = Class.forName("reflection_login.UserService");

        // 获取类的实例
        Object instance = c.newInstance();

        // 获取方法对象
        Method login = c.getMethod("login", String.class, String.class);

        // 给方法传值
        Object returnType = login.invoke(instance, "pd", "123");

        // 输出方法的返回值
        System.out.println(returnType);
    }

}
