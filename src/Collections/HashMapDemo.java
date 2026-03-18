package Collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("pune" , 12);
        hm.put("chinchwad", 14);
        hm.put("Nashik",15);
        hm.put("mumbai",01);

        hm.put("satara",11);
        System.out.println(hm);
        int value = hm.get("Nashik");
        System.out.println(value);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        Collection<Integer> cl = hm.values();

        System.out.println(cl);

        for(int i : cl)
        {
            System.out.println(i);
        }

        for(String s : keys)
        {

            System.out.println(s);
        }

    }
}
