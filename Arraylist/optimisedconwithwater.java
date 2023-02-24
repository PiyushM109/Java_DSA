import java.util.ArrayList;

public class optimisedconwithwater {
    public static int storedwater(ArrayList<Integer> list){
        int maxwater = Integer.MIN_VALUE;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            int ht = Math.min(list.get(lp), list.get(rp));
            int wid = rp-lp;
            int currwater = ht*wid;
            maxwater = Math.max(maxwater, currwater);
            if(list.get(lp)<list.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> Storage = new  ArrayList<>();
        Storage.add(1);
        Storage.add(8);
        Storage.add(6);
        Storage.add(2);
        Storage.add(5);
        Storage.add(4);
        Storage.add(8);
        Storage.add(3);
        Storage.add(7);
        System.out.println(storedwater(Storage));
    }
    
}
