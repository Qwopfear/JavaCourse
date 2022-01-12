package multiThreading;

public class Ex8 {
    static int counter = 0;
    public static synchronized void increment(){
        counter++;
    }

    public static void main(String[] args) {

//        DATA RACE
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(counter);
    }
}

class R implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Ex8.increment();
        }
    }
}
