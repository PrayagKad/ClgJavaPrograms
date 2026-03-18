package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BasicsWriter{

    public static void main(String[] args) {



        try {
            File file = new File("D:\\sample.txt");
            FileWriter fr = new FileWriter(file,false);
            fr.write("kya maam kya halchal");
            fr.append("\n kya re hawle bahut charbi chadi kya teko ?");
            fr.close();

        } catch (IOException  e) {
           e.printStackTrace();
        }

    }



}
