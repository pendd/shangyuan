package test_day02.dielock;

public class DieLock extends Thread {
    private boolean flag;

    public DieLock(boolean flag){
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.objA){
                System.out.println(getName()+"::"+"MyLock.objA");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (MyLock.objB){
                    System.out.println(getName()+"::"+"MyLock.objB");
            }

            }
        }else{
            synchronized (MyLock.objB){
                System.out.println(getName()+"::::"+"MyLock.objB");
                try {
                    sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (MyLock.objA){
                    System.out.println(getName()+":::"+"MyLock.objA");
            }

            }
        }
    }

    public static void main(String[] args) {
        DieLock d1 = new DieLock(true);
        DieLock d2 = new DieLock(false);

        d1.setName("1");
        d2.setName("2");

        d1.start();
        d2.start();
    }
}
