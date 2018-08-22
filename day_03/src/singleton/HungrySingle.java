package singleton;

public class HungrySingle {
    // 恶汉单例模式

    // 在饿汉模式中，初始化变量的时候最好加上 final 关键字，这样比较严谨。
    private static final HungrySingle HINSTANCE = new HungrySingle();

    // 私有化构造方法,不给外界new的机会
    private HungrySingle(){}

    // 因为构造方法私有化不能通过new一个实例来调用方法,所以方法设置成static
    public static HungrySingle getInstance(){
        // 只能用我提供的对象,不能new对象
        return HINSTANCE;
    }

}
