package multiThreading;

public class VolatileEx extends Thread{
    volatile boolean a = true;

    public void run() {
        long counter = 0;
        while (a){
            counter++;
        }
        System.out.println("Loop is finished. Counter = " + counter );
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileEx t = new VolatileEx();
        t.start();
        Thread.sleep(3000);
        t.a = false;
        t.join();

        System.out.println("End of main");

    }


}
