
import java.util.Properties;
import java.util.Set;




public class Repeat {

    private static final String FILE_SEPARATOR = System.getProperty("file.separator");  // 文件分隔符
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");  // 换行

    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        Properties p = System.getProperties();
        Set<Object> set = p.keySet();
        for (Object o : set) {
            System.out.println(o+":::"+p.get(o));
        }
        System.out.println("===========");
        System.out.println(p.getProperty("os.name"));
        System.out.println(FILE_SEPARATOR);

        System.out.println("你好"+LINE_SEPARATOR+"世界");

        System.out.println("============");

        double d1 = Math.ceil(12.34);   // 大于参数的最小整数
        double d2 = Math.floor(12.34);  // 小于参数的最大整数
        double d3 = Math.round(12.34);  // 四舍五入

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        for (int i = 0; i < 10; i++) {
            int d = (int)Math.ceil(Math.random()*6);  // [1-6]
            System.out.println(d);
        }



    }
}
