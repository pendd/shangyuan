package day_01;

public class MyThread2 extends Thread {

    // 有参构造 给线程设置名字
    public MyThread2(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+":::"+(i+1));
        }
    }

    public static void main(String[] args) {

        MyThread2 my1 = new MyThread2("t1");
        MyThread2 my2 = new MyThread2("t2");

        // 启动了两个线程
        my1.start();
        my2.start();
    }
}
