package StreamAPI;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StreamAPILIveAppln {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        // print all dept in org
        list.stream().map(Employee :: getPosition).distinct().forEach(System.out::println);

        //


    }
}
