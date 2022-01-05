package multiThreading;

// Thread name and Thread priority

public class Ex3 {
    public static void main(String[] args) {
        MyThread5 t5 = new MyThread5();
        t5.setName("MyThread");
        t5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of t5: " + t5.getName());
        System.out.println("Priority of t5: " + t5.getPriority());

        MyThread5 t6 = new MyThread5();
        System.out.println("Name of t5: " + t6.getName());
        System.out.println("Priority of t5: " + t6.getPriority());

        /** Priority scale from 1 to 10; by default: 5;
         * The name does not matter, it is issued in the order of the Thread declaration**/
    }
}


class MyThread5 extends Thread{
    public void run(){
        System.out.println("Hello");
    }
}