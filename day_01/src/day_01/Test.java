package day_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("YY-MM-dd HH:mm:ss");
            String format = sdf.format(date);
            System.out.println(format);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Test t1 = new Test();

        t1.start();
    }
}
