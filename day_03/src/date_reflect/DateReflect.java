package date_reflect;

import java.text.SimpleDateFormat;
import java.util.Date;

// 利用实例反射技术 完成日期类实例对象的输出
public class DateReflect {
    public static void main(String[] args) throws  Exception {
        // 类加载
        Class c1 = Class.forName("java.util.Date");
        // 产生类的实例对象
        Object obj1 = c1.newInstance();

        if(obj1 instanceof Date){
            Date obj = (Date)obj1;
            SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String format = sf.format(obj);
            System.out.println(format);
        }

        /*Class c2 = Class.forName("java.text.SimpleDateFormat");
        Object obj2 = c2.newInstance();*/

    }
}
