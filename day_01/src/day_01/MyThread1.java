package day_01;

/*
 *  创建线程的第一种方式：
 *      1.继承Thread类
 *      2.重写run方法
 *      3.创建线程对象
 *      4.启动线程   线程对象.start()
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"::::"+(i+1));
        }
    }

    public static void main(String[] args) {
        // 创建线程对象
        MyThread1 my1 = new MyThread1();
        MyThread1 my2 = new MyThread1();

        // 给线程设置名字
        my1.setName("t1");
        my2.setName("t2");

        // 启动线程
        my1.start();
        my2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
