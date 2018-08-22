package employee_properties;


import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Properties;

public class EmployeeTest {
    public static void main(String[] args) throws Exception{
        // 创建属性对象
        Properties prop = new Properties();

        // 创建流对象
        FileInputStream is = new FileInputStream("D:/IEDAWorkspace/MonthTwo/day_03/src/employee_properties/employee.properties");

        // 加载
        prop.load(is);

        // 关闭流
        is.close();

        // 读取
        String className = prop.getProperty("className");

        // 利用反射 加载类
        Class aClass = Class.forName(className);
        // 获取所有属性值
        Field[] fields = aClass.getDeclaredFields();

        // 得到类的实例
        Object o = aClass.newInstance();

        Employee emp = new Employee();

        // 遍历所有属性值
        for (Field f : fields) {
            Class type = f.getType();
            String name = f.getName();
            System.out.println(name);
            System.out.println(type);
            if (type.toString().equals("int")){
                System.out.println("111");
                System.out.println(f.getInt(emp));
            }
            System.out.println();
        }


    }
}
