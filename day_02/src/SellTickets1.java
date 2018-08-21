public class SellTickets1 implements Runnable{

    private int tickets = 50;


    @Override
    public void run() {
        while (tickets>0){
            sellTickets();
        }
    }

    private synchronized void sellTickets() {
        if(tickets>0){

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"正在卖出第"+(tickets--)+"张票");
        }
    }

    public static void main(String[] args) {
        SellTickets1 target = new SellTickets1();

        Thread t1 = new Thread(target,"窗口1");
        Thread t2 = new Thread(target,"窗口2");
        Thread t3 = new Thread(target,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
