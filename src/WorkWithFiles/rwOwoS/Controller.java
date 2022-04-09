package WorkWithFiles.rwOwoS;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Executable;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    final static File personFile = new File("src/WorkWithFiles/rwOwoS/carInfo/personFile.txt");
    Scanner sc;
    FileWriter wf;
    FileReader fr;
    String command;

    LinkedHashMap<String,Person> personList = new LinkedHashMap<>();
    LinkedHashMap<String,Car> carList = new LinkedHashMap<>();


    public Controller() {
        readAppInfo();
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
                case "create car" : {
                    createCar();
                    break;
                }
                case "add person new car" : {
                    addCarToPerson();
                    break;
                }
                default:
                    break;
            }
            s = sc.nextLine();
            s = s.toLowerCase(Locale.ROOT).trim();
            System.out.println(s);
        }
    }

    void savePerson() {
        try {
            Iterator<Map.Entry<String, Person>> pi = personList.entrySet().iterator();
            wf = new FileWriter(personFile);

            while (pi.hasNext()) {
                Map.Entry<String, Person> p= pi.next();
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
        personList.put(p1.id,p1);
    }

    void createPerson(String name) {
        Person p1 = new Person(name);
        personList.put(p1.id,p1);
    }


    void createCar() {
        System.out.println("Get car mark: ");
        String name = sc.nextLine();
        Car c1 = new Car(name);
        carList.put(c1.id,c1);
        System.out.println(carList);
    }

    void addCarToPerson(){
        System.out.println("Get car id: ");
        String carId = sc.nextLine();
        System.out.println("Get peron id: ");
        String personId = sc.nextLine();
        try{
            personList.get(personId)
                    .addNewCar(carList.get(carId));
            carList.remove(carId);
        }catch (NullPointerException ex){
            System.out.println("Car or Person with that id does NOT exist");
        }
        System.out.println(carList);
    }

    public LinkedHashMap<String,Person> getPersonList(){
        return personList;
    }
    public LinkedHashMap<String,Car> getCarList(){
        return carList;
    }


    void readAppInfo(){
        try {
            fr = new FileReader(Controller.personFile);
            String name = "";
            int character;
            while ((character = fr.read()) != -1) {
//                System.out.print((char) character);
                name += (char)character;

            }
            String[] personInfo = name.split("\n");
            System.out.println(Arrays.toString(personInfo));
            for (String person: personInfo) {
                System.out.println("Person : " +  person);
                Pattern nameP = Pattern.compile("name='[A-Za-z]+'");
                Matcher nameM = nameP.matcher(person);
//                System.out.println("Person info: " + person);
                if (nameM.find()){
                System.out.println("Matcher works");
                    name = nameM.group().
                            substring(6 , nameM.group().length() - 1);
//                    System.out.println(name);
                }
//                System.out.println(name);

                createPerson(name);
            }

            System.out.println("Done");
            System.out.println("Current person is: " + getPersonList().toString());
            System.out.println("Current cars is: " + getCarList().toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



