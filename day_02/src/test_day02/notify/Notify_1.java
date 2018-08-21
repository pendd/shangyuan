package test_day02.notify;

public class Notify_1 extends Thread{
    Object obj;
    public Notify_1(Object obj,String name){
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println(getName()+"在释放线程");
            obj.notify();
        }
    }
}
