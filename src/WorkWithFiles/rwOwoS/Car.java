package WorkWithFiles.rwOwoS;

public class Car {
    String id;
    String name;

    static int index;

    public Car(String name) {
        this.name = name;
        id = "C" + index;
        index++;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
