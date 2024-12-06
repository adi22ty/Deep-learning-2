package Day30;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);


        
        ls.add(10);
        ls.add(10);
        ls.add(30);
        ls.add(400);
        ls.add(100);
        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ls);





        
    }
    
}
