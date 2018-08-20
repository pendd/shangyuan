package day_01;

public class MyThread4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            // Thread.currentThread().getName()  永远都是获取当前线程的名字
            System.out.println(Thread.currentThread().getName()+"::::"+(i+1));
        }
    }

    public static void main(String[] args) {
        // 创建接口对象
        MyThread4 runnable = new MyThread4();


        // 共用同一个对象
        Thread t1 = new Thread(runnable,"t1");
        Thread t2 = new Thread(runnable,"t2");

        t1.start();
        t2.start();
    }
}
