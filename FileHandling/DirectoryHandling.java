package FileHandling;

import java.io.File;

public class DirectoryHandling {
    
    public static void main(String[] args) {
        File dir = new File("myFolder");

        
        dir.mkdir();      // single folder
        dir.mkdirs();     // nested folders

        
        // TO READ FILES FROM DIRECTORY AS STRING
        String[] files = dir.list();
        for (String f : files) {
            System.out.println(f);
        }



        // TO READ FILES FROM DIRECTORY AS FILE OBJECTS

        // File[] files = dir.listFiles();
        // for (File f : files) {
        //     System.out.println(f);
        // }
    }
}
