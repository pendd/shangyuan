package test_day02.notify;

public class Wait_1 extends Thread {

    private Object obj;
    public Wait_1(Object obj, String name){
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println(getName()+"在阻塞线程");
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+"线程通了");
        }
    }
}
