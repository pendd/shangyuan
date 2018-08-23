import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test {
    public static void main(String[] args) throws Exception {
        Class<?> user = Class.forName("User");

        /*Constructor<?> constructor1 = user.getDeclaredConstructor();

        System.out.println(constructor1);

        System.out.println("==============");

        Constructor<?>[] constructors = user.getConstructors();

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }*/

        Field name = user.getField("name");

        // 获取类的全称
        String canonicalName = user.getCanonicalName();
        System.out.println(canonicalName);

        System.out.println(name);
    }
}
