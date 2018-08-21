public class DieLock extends Thread{

    boolean flag;

    @Override
    public void run() {
        if(flag){
            synchronized (MyLock.objA){
                System.out.println();
            }
        }
    }
}
