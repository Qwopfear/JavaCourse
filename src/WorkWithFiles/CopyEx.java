package WorkWithFiles;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/WorkWithFiles/rubai2.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/WorkWithFiles/poem.txt",true))){
//            int character;
//            while ((character=br.read()) != -1){
//               bw.write((char) character);
//            }
            String line;
            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.write("\n");
            }

        }
    }
}
