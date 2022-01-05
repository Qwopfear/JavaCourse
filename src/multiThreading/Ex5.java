package multiThreading;

public class Ex5 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i + " " +  Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable1());
        Thread t2 = new Thread(new Ex5());
        t1.start();
        t2.start();

        System.out.println("Finish"); // Main NOT sleep and "Finish" will be before other threads
    }
}


class MyRunnable1 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(i + " " +  Thread.currentThread().getName());
        }
    }
}