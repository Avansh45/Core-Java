package FileHandling;

import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FileReader;

// Task 1:
// Write a program:
// Write multiple lines using BufferedWriter
// Task 2:
// Read a large file using BufferedReader
// Task 3:
// Copy a file using buffered byte streams
public class ExampleOfBRandBW{
    public static void main(String[] args) {
        
        //----------------------------Task 1:--------------------------------- 

        // try(BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt",true))){

        //     bw.write("Java is one of the most commonly used programming language in big Enterprises.");
        //     bw.newLine();
        //     bw.write("Java can build Scalable platforms.");
        //     bw.newLine();


        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // --------------------------Task 2:----------------------------------------

        // try(BufferedReader br = new BufferedReader(new FileReader("file.txt"))){
            
        //     String data ;
        //     while((data = br.readLine()) != null){
        //         System.out.println(data);
        //     }

        // }catch(IOException e){
        //     e.printStackTrace();
        // }



        // --------------------------------Task 3:---------------------------------------------
        
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.txt"));
    BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"))){

            byte[] bytes = new byte[1024];
            int buffer;
            while((buffer = bis.read(bytes)) != -1){
                bos.write(bytes, 0, buffer);
            }
            
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
