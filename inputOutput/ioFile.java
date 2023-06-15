package inputOutput;
import java.io.*;
public class ioFile {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("amaanINP.txt");
            fw.write("amaan wanie 5");
            fw.close();
             FileInputStream fis = new FileInputStream("amaanINP.txt");
             FileOutputStream fos = new FileOutputStream("amaanOUT.txt");
           int data;
           while ((data=fis.read())!=-1){
               fos.write(data);
           }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


