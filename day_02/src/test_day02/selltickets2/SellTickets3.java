package test_day02.selltickets2;

public class SellTickets3 extends Thread{
    private Ticket ticket;

    public SellTickets3(Ticket ticket,String name){
        super(name);
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (ticket.getTickets()>0){
            synchronized (ticket){
                if(ticket.getTickets()>0){
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket.setTickets(ticket.getTickets()-1);
                    System.out.println(getName()+"：：：：："+(50-ticket.getTickets()));
                }
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();

        SellTickets3 s1 = new SellTickets3(ticket,"1");
        SellTickets3 s2 = new SellTickets3(ticket,"2");
        SellTickets3 s3 = new SellTickets3(ticket,"3");

        s1.start();
        s2.start();
        s3.start();
    }
}
