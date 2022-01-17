package WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String link = "/home/vsevolod/Desktop/rubai.txt";
        String rubai =
                "У попа была собака."+
                "Он ее любил." +
                "Она сьела кусок мяса." +
                "Он ее убил.";


        FileWriter writer = null;
        try{
            writer = new FileWriter(link);
            for (int i = 0; i < rubai.length(); i++) {
                writer.write(rubai.charAt(i));
            }
            System.out.println("Done!");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            writer.close();
        }

    }
}
