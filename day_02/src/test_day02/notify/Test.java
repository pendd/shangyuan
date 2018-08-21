package test_day02.notify;

public class Test{

    public static void main(String[] args) {
        Object obj = new Object();

        Wait_1 w = new Wait_1(obj,"1");
        Notify_1 n = new Notify_1(obj,"2");

        w.start();
        n.start();
    }


}
