package WorkWithFiles.rwOwoS;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    final static File personFile = new File("src/WorkWithFiles/rwOwoS/carInfo/personFile.txt");
    Scanner sc;
    FileWriter wf;
    FileReader fr;
    String command;

    LinkedHashMap<String, Person> personList = new LinkedHashMap<>();
    LinkedHashMap<String, Car> carList = new LinkedHashMap<>();

    public Controller() {
        readAppInfo();
        System.out.println(personList);
        sc = new Scanner(System.in);
        this.command = sc.nextLine();
        control(command);
    }


    void control(String s) {
        s = s.toLowerCase(Locale.ROOT).trim();
        System.out.println(s);
        while (!s.equals("quit")) {
            switch (s) {
                case "save person": {
                    savePerson();
                    break;
                }
                case "create person": {
                    createPerson();
                    break;
                }
                case "create car": {
                    createCar();
                    break;
                }
                case "add person new car": {
                    addCarToPerson();
                    break;
                }
                default:
                    break;
            }
            s = sc.nextLine().toLowerCase(Locale.ROOT).trim();
            System.out.println(s);
        }
    }

    void savePerson() {
        try {
            Iterator<Map.Entry<String, Person>> pi = personList.entrySet().iterator();
            wf = new FileWriter(personFile);
            while (pi.hasNext()) {
                Map.Entry<String, Person> p = pi.next();
                String ps = p.toString();
                for (int i = 0; i < ps.length(); i++) {
                    wf.write(ps.charAt(i));
                    System.out.print(ps.charAt(i));
                }
                System.out.println();
                wf.write('\n');
            }
            wf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void createPerson() {
        System.out.println("Get person name: ");
        String name = sc.nextLine();
        Person p1 = new Person(name);
        personList.put(p1.id, p1);
    }

    Person createPerson(String name) {
        Person p1 = new Person(name);
        personList.put(p1.id, p1);
        return p1;
    }


    void createCar() {
        System.out.println("Get car mark: ");
        String name = sc.nextLine();
        Car c1 = new Car(name);
        carList.put(c1.id, c1);
        System.out.println(carList);
    }

    void addCarToPerson() {
        System.out.println("Get car id: ");
        String carId = sc.nextLine();
        System.out.println("Get peron id: ");
        String personId = sc.nextLine();
        try {
            personList.get(personId)
                    .addNewCar(carList.get(carId));
            carList.remove(carId);
        } catch (NullPointerException ex) {
            System.out.println("Car or Person with that id does NOT exist");
        }
        System.out.println(carList);
    }

//    void sellCar(){
//        System.out.println("Which person selling car: ");
//        String personId = sc.nextLine();
//        System.out.println("Get car id: ");
//        String carId = sc.nextLine();
//        Person p1 = personList.get(personId);
//        Car c1 = p1.personCars.get(carId);
//    }


    void readAppInfo() {
        try {
            if (personFile.createNewFile()) {
                System.out.println("Created file");
            } else {
                fr = new FileReader(Controller.personFile);
                String name = "";
                int character;
                while ((character = fr.read()) != -1) {
//                System.out.print((char) character);
                    name += (char) character;

                }
                String[] personInfo = name.split("\n");
//                System.out.println(Arrays.toString(personInfo));
                for (String person : personInfo) {
                    ArrayList<String> carsOfPerson = new ArrayList<>();
//                    System.out.println("Person : " + person);
                    Pattern nameP = Pattern.compile("'[A-Za-z]+'");
                    Matcher nameM = nameP.matcher(person);
                    int count = 0;
                    while (nameM.find()) {
//                        System.out.println("Matcher works");
                        if (count == 0){
                            name = nameM.group()
                                    .substring(1, nameM.group().length() - 1);
//                            System.out.println("Is name " + name);
                        }else {
                            carsOfPerson.add(nameM.group() .substring(1, nameM.group().length() - 1));
//                            System.out.println(nameM.group() .substring(1, nameM.group().length() - 1) + " is Car");
                        }
                        count++;

                    }
                    Person p1 = createPerson(name);
                    for (String ofPerson : carsOfPerson) {
                        Car c1 = new Car(ofPerson);
                        p1.addNewCar(c1);
                    }

                }
            }
//            System.out.println("Done");
            System.out.println("Current person is: " + getPersonList().toString());
            System.out.println("Current cars is: " + getCarList().toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LinkedHashMap<String, Person> getPersonList() {
        return personList;
    }

    public LinkedHashMap<String, Car> getCarList() {
        return carList;
    }
}



