package FileHandling;

import java.io.File;
import java.io.IOException;
public class ImpMethodsInFile {
    public static void main(String[] args) {
        
        File file = new File("demo.txt");

        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println(e);
        }
        // System.out.println(file.exists());
        // System.out.println(file.getName());
        // System.out.println(file.getAbsolutePath());
        // System.out.println(file.length());
        // System.out.println(file.isFile());
        // System.out.println(file.isDirectory());
        file.delete();

    }
}
