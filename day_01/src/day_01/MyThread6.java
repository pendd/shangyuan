package day_01;

public class MyThread6 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"::"+i);
        }
    }

    public static void main(String[] args) {
        MyThread6 my1 = new MyThread6();
        MyThread6 my2 = new MyThread6();
        MyThread6 my3 = new MyThread6();

        my1.start();

        /**
         * public final void join(long millis)
         throws InterruptedException
         等待这个线程死亡的时间最多为millis毫秒。 0的超时意味着永远等待。
         */
        // 如果有参数，表示在多少毫秒后自由抢占
        try {
            my1.join(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        my2.start();
        my3.start();
    }
}
