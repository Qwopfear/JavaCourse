package WorkWithFiles.rwOwoS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Controller {
    final static File personFile = new File("src/WorkWithFiles/rwOwoS/carInfo/personFile.txt");
    Scanner sc;
    FileWriter wf;
    String command;

    LinkedList<Person> personList = new LinkedList<>();

    public Controller() {
        sc = new Scanner(System.in);
        this.command = sc.nextLine();
        control(command);
    }


    void control(String s) {
        while (!s.equals("quit")) {
            switch (s) {
                case "Save person": {
                    savePerson();
                    break;
                }
                case "Create person": {
                    createPerson();
                    break;
                }
                default:
                    break;
            }
            s = sc.nextLine();
        }
    }

    void savePerson() {
        try {
            Iterator<Person> pi = personList.iterator();
            wf = new FileWriter(personFile);

            while (pi.hasNext()) {
                Person p= pi.next();
                String ps = p.toString();
                for (int i = 0; i < ps.length(); i++) {
                    wf.write(ps.charAt(i));
                    System.out.println(ps.charAt(i));
                }
                System.out.println(p.toString());
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
        personList.add(p1);
    }


}
