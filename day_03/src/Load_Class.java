public class Load_Class {

    public static void main(String[] args) throws ClassNotFoundException {

        // 类加载方法一:
        //Class.forName("Load");     // 执行静态代码块

        // 类加载方法二:
        Class<Load> loadClass = Load.class;// 不会执行静态代码块

        // 类加载方法三:
        Load load = new Load();
        Class<? extends Load> aClass = load.getClass();        // 会执行静态代码块，是由于new Load() 这一条语句


    }
}
