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

    public Car(String name,String id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    void setIndex(int i){
        index = i;
    }
}
