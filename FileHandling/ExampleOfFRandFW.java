package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Task 1:
// Write a program:
// Write multiple lines into a file
// Task 2:
// Read file:
// Print character by character
// Task 3:
// Read file:
// Print line by line (using BufferedReader)
public class ExampleOfFRandFW {
    public static void main(String[] args) {
        
        try{
            // Task1
            FileWriter fw = new FileWriter("demo.txt");
            fw.write("Java is not purely object oriented.");
            fw.write("\nIt is just because of static and premitive Data Types");
            fw.close();

            //Task 2
            FileReader fr = new FileReader("demo.txt");
            int ch ;
            while((ch=fr.read())!= -1){
                System.out.print((char)ch);
            }
            fr.close();
            
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null){
                System.out.print(line);
            }
            br.close();
        }catch(IOException e ){
            e.printStackTrace();
        }
    }
}







// package FileHandling;

// import java.io.*;

// public class ExampleOfFRandFW {
//     public static void main(String[] args) {

//         // Task 1: Writing into file
//         try (FileWriter fw = new FileWriter("demo.txt")) {
//             fw.write("Java is not purely object oriented.\n");
//             fw.write("It is just because of static and primitive data types.\n");
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         // Task 2: Character by character reading
//         try (FileReader fr = new FileReader("demo.txt")) {
//             int ch;
//             while ((ch = fr.read()) != -1) {
//                 System.out.print((char) ch);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         System.out.println("\n--- Line by Line ---");

//         // Task 3: Line by line reading
//         try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
//             String line;
//             while ((line = br.readLine()) != null) {
//                 System.out.println(line);
//             }
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }