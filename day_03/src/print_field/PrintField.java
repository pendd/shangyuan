package print_field;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class PrintField {

    public static void main(String[] args) throws Exception {
        ArrayList<Object> list = null;

        // 加载类
        Class aClass = Class.forName("java.lang.Integer");

        // 获取类名
        String name = aClass.getSimpleName();

        // 获取类的修饰符 返回int型
        int i = aClass.getModifiers();

        // 把上一步得到的int型数据转为具体的权限名称
        String s = Modifier.toString(i);

        System.out.println(s+" "+"class "+name+" {");

        // 获取所有属性值
        Field[] field = aClass.getDeclaredFields();

        // 遍历属性值
        for (Field field1 : field) {

            field1.setAccessible(true);

            // 获取属性名称
            String name1 = field1.getName();

            // 获取数据类型
            Class type = field1.getType();

            String name2 = type.getSimpleName();

            // 获取修饰符  返回int型
            int i1 = field1.getModifiers();

            // 把上一步得到的int型数据转为具体的权限名称
            String s1 = Modifier.toString(i1);

            // 格式
            String str = "\t"+" "+s1+" "+name2+" "+name1+" = ";


            Object o = field1.get(new Integer(1));

            if(o.toString().equals("-2147483648")||o.toString().equals("2147483647"))
                System.out.println(str+"0x"+Integer.toHexString(field1.getInt(new Integer(1))));
            else
                System.out.println(str+""+o);

            // 判断该属性是否是数组
            /*if(o.getClass().isArray()){
                System.out.println(str+""+o);
            }*/

        }

        System.out.println("}");

    }
}
