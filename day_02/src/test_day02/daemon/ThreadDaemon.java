package test_day02.daemon;

public class ThreadDaemon extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {

            System.out.println(getName()+"::::"+i);
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        ThreadDaemon t1 = new ThreadDaemon();
        ThreadDaemon t2 = new ThreadDaemon();

        t1.setName("张三");
        t2.setName("李四");

        t1.setDaemon(true);
        t2.setDaemon(true);

        t1.start();
        t2.start();

        Thread.currentThread().setName("王五");
        for (int i = 0; i <5 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-----"+i);
        }
    }
}
