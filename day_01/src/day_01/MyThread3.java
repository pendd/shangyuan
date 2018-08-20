package day_01;

/*
 * 创建线程的第二种方式：
 *      1.实现Runable接口
 *      2.重写run()方法
 *      3.创建线程对象
 *      4.开启线程    new Thread(线程对象).start()
 */
public class MyThread3 implements Runnable {
    String name;

    public MyThread3(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"::::"+(i+1));
        }
    }

    public static void main(String[] args) {
       /* MyThread3 my1 = new MyThread3("t1");
        MyThread3 my2 = new MyThread3("t2");

        new Thread(my1).start();
        new Thread(my2).start();*/
    }
}
