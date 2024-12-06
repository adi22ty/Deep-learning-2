package Day30;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;


public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hp = new HashMap<>();
        TreeMap<Integer, Integer> tp = new TreeMap<>();
        LinkedHashMap<Integer,Integer> lp=new LinkedHashMap<>();

        // Adding elements to HashMap
        hp.put(3, 30);
        hp.put(5, 20);
        hp.put(7, 50);
        hp.put(1, 70);
        hp.put(2, 60);

        tp.put(3, 30);
        tp.put(5, 20);
        tp.put(7, 50);
        tp.put(1, 70);
        tp.put(2, 60);

        lp.put(2,35);
        lp.put(3,45);
        lp.put(50,40);
        lp.put(6,54);

        System.out.println(hp);
        System.out.println(tp);
        System.out.println(lp);
    }
}