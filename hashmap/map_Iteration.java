import java.util.*;
public class map_Iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("China",150);
        hm.put("india",100);
        hm.put("USA",60);
        hm.put("Nepal",10);
        hm.put("Argentina",65);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(k+"->"+hm.get(k));
        }
        
    }
}
