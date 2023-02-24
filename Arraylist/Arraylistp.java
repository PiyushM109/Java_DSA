import java.util.ArrayList;
import java.util.Scanner;
// import java.util.*;

public class Arraylistp{
    public static int maximum(ArrayList<Integer>List){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<List.size(); i++){
            if(max<List.get(i)){
                max= List.get(i);
            }
        }
        return max;
    }
    //function for swapnig values at two indexes
    
    public static void main(String[] args) {
        ArrayList<Integer>List=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // List.add(1);
        // List.add(2);
        // List.add(3);
        // System.out.println(List);
        // System.out.println(List.get(2));
        // List.remove(1);
        // System.out.println(List);
        // List.set(1, 4);
        // System.out.println(List);
        // System.out.println(List.contains(4));
        for(int i=0; i<5; i++){
            int temp = sc.nextInt();
            List.add(temp);
        }
        System.out.println(List);
        // for(int i=List.size()-1; i>=0; i--){
        //    System.out.print(List.get(i));
        // }
        System.out.println(maximum(List));
        
        

    }
}