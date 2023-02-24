import java.util.ArrayList;

public class contwithmostwater_brut {
    public static int mostwater(ArrayList<Integer> list){
        int water=0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                int ht = Math.min(list.get(j), list.get(i));
                int wid = j-1;
                water = ht*wid;
            }
            max = Math.max(max, water);
        }
        return max;
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
        System.out.println(mostwater(Storage));
    }
    
}
