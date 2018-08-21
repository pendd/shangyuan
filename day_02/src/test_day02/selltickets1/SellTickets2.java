package test_day02.selltickets1;

public class SellTickets2 implements Runnable{


    private int tickets = 60;

    @Override
    public void run() {
        while(tickets>0)
            sellTickets();
    }

    private synchronized void sellTickets() {
        if(tickets>0) {
            System.out.println(Thread.currentThread().getName() + ":::" + (tickets--));
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SellTickets2 target = new SellTickets2();

        Thread t1 = new Thread(target,"1");
        Thread t2 = new Thread(target,"2");
        Thread t3 = new Thread(target,"3");

        t1.start();
        t2.start();
        t3.start();
    }
}
