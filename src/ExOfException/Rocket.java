package ExOfException;

public class Rocket {
    String name;
    int fuelWeight;

    public Rocket(String name, int fuelWeight) {
        this.name = name;
        this.fuelWeight = fuelWeight;
    }

    void tank(){
        fuelWeight += 100 + Math.random() * 100;
        System.out.println(fuelWeight);
    }

    void start() throws NotEnoughFuelException{
       try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
           e.printStackTrace();
       }
        if (fuelWeight < 500){
            throw new NotEnoughFuelException();
        }else System.out.println("Let`s go!!!");

    }

}


class NotEnoughFuelException extends Exception{
    public NotEnoughFuelException(){
        System.out.println("Tank rocket pls");
    }
}