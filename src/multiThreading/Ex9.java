package multiThreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Main begins");

        Thread worker = new Thread(new Worker());
        System.out.println(worker.getState());
        worker.start();
        System.out.println(worker.getState());
        worker.join();
        System.out.println(worker.getState());
        System.out.println("Main ends");

    }
}


class Worker implements Runnable{
    @Override
    public void run() {
        System.out.println("Work begins");
      try {
            Thread.sleep(2500);
        }catch (InterruptedException e){
          e.printStackTrace();
      }
        System.out.println("Work ends");
    }
}