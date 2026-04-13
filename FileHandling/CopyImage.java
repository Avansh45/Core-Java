package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) {
        
        try( FileOutputStream fos = new FileOutputStream("C:\\Users\\hp\\MYDOCUMENTS\\newmypic.jpg");
            FileInputStream fis = new FileInputStream("C:\\Users\\hp\\MYDOCUMENTS\\my_pic.jpg")){
            
            byte[] buffer = new byte[1024];
            int bytesRead;
            while((bytesRead=fis.read(buffer))!=-1){
                fos.write(buffer,0,bytesRead);
            }
            // fos.close();
            // fis.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
