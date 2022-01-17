package WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String link = "/home/vsevolod/Desktopr/rubai.txt";
        String rubai =
                "У попа была собака.\n"+
                "Он ее любил.\n" +
                "Она сьела кусок мяса.\n" +
                "Он ее убил.\n";


        FileWriter writer = null;
        try{
            writer = new FileWriter(link);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        }catch (IOException e){
            writer = new FileWriter("src/WorkWithFiles/rubai2.txt");
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            writer.write(e.getMessage());

        }finally {
            writer.close();
        }

    }
}
