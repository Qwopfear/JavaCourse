package multiThreading;

public class Ex6 implements Runnable{
    @Override
    public void run() {
        System.out.println("Method run. Thread name : " +
                Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        Thread thread2 = new Thread(new Ex6());
        Thread thread3 = new Thread(new Ex6());


        thread.start();
        thread2.run(); // Runs as part of the main thread. Is incorrect
        thread3.start();

        System.out.println("Method main. Thread name : " +
                Thread.currentThread().getName());
    }
}
