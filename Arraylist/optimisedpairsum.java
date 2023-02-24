import java.util.ArrayList;

public class optimisedpairsum {
    public static boolean pairsum(ArrayList<Integer> list, int Target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==Target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)<Target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(pairsum(List, 11));


    }
}
