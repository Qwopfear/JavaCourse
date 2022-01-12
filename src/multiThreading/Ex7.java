package multiThreading;

public class Ex7 {
    public static void main(String[] args) {
        MyRunnableImp1 r1 = new MyRunnableImp1();

//        DATA RACE

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();

      /* for elude from data race I have to use the
      * "synchronized" key-word in definition of method */
    }

}

class Counter{
    volatile static int count = 0;
}


class MyRunnableImp1 implements Runnable{
    synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");

    }

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}