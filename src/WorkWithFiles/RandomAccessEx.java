package WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessEx {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("Text.txt","rw")){
            long pointer = 0;
            String tab = "  ";
            for (int i = 0; i < 15; i++) {
                file.seek(pointer);
                file.writeBytes("Hello im here" + '\n' +  tab);
                tab += "   ";
                pointer = file.getFilePointer();
            }


            System.out.println(pointer);

        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

}
