package ExOfException;

public class Start {
    public static void main(String[] args) {
        Rocket r1 = new Rocket("Apollo", 0);

        r1.tank();
        r1.tank();
        r1.tank();
        r1.tank();
        try {
            r1.start();
        }catch (NotEnoughFuelException e){
            e.getMessage();
        }

    }
}
