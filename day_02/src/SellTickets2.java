public class SellTickets2 implements Runnable{

    private int tickets = 50;

    Object obj = new Object();


    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖出第"+(tickets--)+"张票");
                }else
                    break;
            }
        }
    }

    public static void main(String[] args) {

        SellTickets1 target = new SellTickets1();

        Thread t1 = new Thread(target,"窗口1");
        Thread t2 = new Thread(target,"窗口2");
        //Thread t3 = new Thread(target,"窗口3");

        t1.start();
        t2.start();
    }
}
