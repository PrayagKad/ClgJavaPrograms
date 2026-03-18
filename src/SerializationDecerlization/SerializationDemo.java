package SerializationDecerlization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("D:\\employee.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file,true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Employee emp = new Employee(101, " ramukaka" , 45678.32f);
            Employee emp1 = new Employee(102, " ramu" , 4567.32f);


            oos.writeObject(emp);
            oos.writeObject(emp1);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
