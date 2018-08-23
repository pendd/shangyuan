import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class aClass = Class.forName("java.util.Date");

        Object o = aClass.newInstance();

        Date date = (Date)o;

        System.out.println(new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(date));
        System.out.println(new SimpleDateFormat().format(date));

        Class<Date> cDate = Date.class;
        Date date1 = cDate.newInstance();
        System.out.println(date1);

        Date date2 = new Date();
        Class<? extends Date> aClass1 = date2.getClass();
        System.out.println(aClass1);

        // 原形可以实现反射
        Class<Double> doubleClass = double.class;
        System.out.println(doubleClass);


    }
}
