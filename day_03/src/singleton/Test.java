package singleton;


//  有问题
public class Test {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("singleton.LazySingle");


        // 拿到构造器

        Object o = c.newInstance();
        if(o instanceof LazySingle){
            LazySingle la = (LazySingle)o;
            la.a();
        }

    }
}
