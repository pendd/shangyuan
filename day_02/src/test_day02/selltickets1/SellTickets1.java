package test_day02.selltickets1;

public class SellTickets1 implements Runnable{

    Object obj = new Object();
    private static int tickets = 50;    // 在实现Runnable接口中,要不要static都是ok的

    @Override
    public void run() {
        while (true){
            synchronized (obj){     //  注意synchronized放的位置
                if(tickets>0){
                    System.out.println(Thread.currentThread().getName()+"在卖票"+(tickets--));
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        SellTickets1 target = new SellTickets1();

        Thread t1 = new Thread(target,"1");
        Thread t2 = new Thread(target,"2");
        Thread t3 = new Thread(target,"3");

        t1.start();
        t2.start();
        t3.start();
    }
}
