package SerializationDecerlization;

import java.io.*;

public class DeserializationDemo {

    public static void main(String[] args) {


        try {
            File file = new File("D:\\employee.txt");
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            Employee emp = (Employee)o;
            System.out.println(emp);
            ois.close();
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
