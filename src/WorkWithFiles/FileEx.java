package WorkWithFiles;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {

        //Relative path
        File file = new File("rubai2.txt");
        File file2 = new File("rubai1.txt");

        // Absolute path
        File folder = new File("/home/vsevolod/Desktop");
        File folder2 = new File("/home/vsevolod/Desktop/Album");


        System.out.println("file.getAbsolutePath() -> " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() -> " + folder.getAbsolutePath());
        System.out.println("----------------------------------------------------------");


        // Check is absolute path or not;
        System.out.println("file.isAbsolute() -> " + file.isAbsolute());
        System.out.println("folder.isAbsolute() -> " + folder.isAbsolute());
        System.out.println("----------------------------------------------------------");


        // Check Directory ot not
        System.out.println("file.isDirectory() -> " + file.isDirectory());
        System.out.println("folder.isDirectory() -> " + folder.isDirectory());
        System.out.println("----------------------------------------------------------");


        // Check file or folder exist or not
        //Return true if file exist
        System.out.println("file.exists() -> " + file.exists());
        System.out.println("folder.exists() -> " + folder.exists());
        System.out.println("file.exists() -> " + file2.exists());
        System.out.println("folder.exists() -> " + folder2.exists());
        System.out.println("----------------------------------------------------------");

        //Create new file; createNewFile() throws IOException
        //mkdir() create new directory
        // if creating success return true else false
        System.out.println("file.createNewFile() -> " + file2.createNewFile());
        System.out.println("folder.mkdir() -> " + folder2.mkdir());
        System.out.println("----------------------------------------------------------");


        //File length()
        System.out.println("file.length() -> " + file2.length());
        System.out.println("folder.length() -> " + folder2.length());
        System.out.println("----------------------------------------------------------");

        //File delete();
        // can delete() directory only if directory is empty
        System.out.println("file2.delete() -> " + file2.delete());
        System.out.println("folder2.delete() -> " + folder2.delete());
        System.out.println("----------------------------------------------------------");


        //listFiles()
        // return File[] absolutePath
        System.out.println("folder.listFiles() -> " + Arrays.toString(folder.listFiles()));
        System.out.println("folder2.listFiles() -> " + folder2.listFiles());
        System.out.println("----------------------------------------------------------");

        // isHidden(), canRead(), canWrite(), canExecute();
        System.out.println("file.isHidden() -> " + file.isHidden());
        System.out.println("file.canRead() -> " + file.canRead());
        System.out.println("file.canWrite() -> " + file.canWrite());
        System.out.println("file.canExecute() -> " + file.canExecute());
        System.out.println("----------------------------------------------------------");

//        Runtime.getRuntime().exec("attrib +. " + file);

//        System.out.println("file.isHidden() -> " + file.isHidden());

    }
}
