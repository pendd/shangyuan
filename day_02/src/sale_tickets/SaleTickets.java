package sale_tickets;

public class SaleTickets extends Thread {

    //  有问题

    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if (Ticket.tickets<=0)
                    break;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"正在卖出第"+(Ticket.tickets--)+"张票");
            }
        }
    }

    public static void main(String[] args) {

        Thread s1 = new SaleTickets();
        Thread s2 = new SaleTickets();
        Thread s3 = new SaleTickets();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();
    }

}
