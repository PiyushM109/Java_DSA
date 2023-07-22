import java.util.*;
public class basic{

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("USA", 50);
        System.out.println(hm);

        System.out.println(hm.get("India"));
        System.out.println(hm.containsKey("USA"));
        System.out.println(hm.remove("USA"));
        System.out.println(hm);

    }
}