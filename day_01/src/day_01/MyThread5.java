package day_01;


import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread5 extends Thread{

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(d);
            System.out.println(Thread.currentThread().getName()+"::"+date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
