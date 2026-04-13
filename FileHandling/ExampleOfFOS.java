package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;

// Write a program to:
// Write your name into a file using FileOutputStream
// Read that file and print content

public class ExampleOfFOS {
    public static void main(String[] args) {
        
        // File file = new File("myName");
        // try{
        //     file.createNewFile();
            
        // }catch(IOException e){
        //     System.out.println(e);
        // }

        try(FileOutputStream fos = new FileOutputStream("myName", true);) {
            String name = "Avansh Chadgal";
            byte[] nameBytes = name.getBytes();
            fos.write(nameBytes);
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("myName")){

            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!= -1){
                System.out.println(new String(buffer, 0, bytesRead));
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
