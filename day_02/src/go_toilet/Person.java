package go_toilet;

public class Person extends Thread{
    // 厕所对象
    private Object obj;

    public Person(Object obj,String name){
        super(name);
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized (obj){
            System.out.println(Thread.currentThread().getName()+"");
            obj.notify();
        }
    }
}
