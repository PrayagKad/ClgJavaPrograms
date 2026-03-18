package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("D:\\sample.txt");
            FileReader fr = new FileReader(file);

            while(fr.read() != -1) // loop until read reaches till the end of file
            {
                System.out.print((char)fr.read());  //.read() gives single integer as return type // so convert to char before print

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
