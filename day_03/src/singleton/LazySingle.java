package singleton;

// 懒汉单例设计模式
public class LazySingle {

    private static LazySingle sInstance;

    private LazySingle(){}

    public static LazySingle getInstance(){
        if(sInstance == null){
            synchronized (LazySingle.class){
                if(sInstance == null){
                    sInstance = new LazySingle();
                }
            }
        }
        return sInstance;
    }

    public void a(){
        System.out.println("你好");
    }
}
