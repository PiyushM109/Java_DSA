import java.util.*;
public class multidimensionalAL {
    public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>main = new ArrayList<>();
    ArrayList<Integer>first = new ArrayList<>();
    ArrayList<Integer>second = new ArrayList<>();
    ArrayList<Integer>third = new ArrayList<>();
    first.add(1);
    first.add(2);
    first.add(3);
    first.add(4);
    first.add(5);
    main.add(first);
    second.add(2);
    second.add(4);
    second.add(6);
    second.add(8);
    second.add(10);
    main.add(second);
    third.add(3);
    third.add(6);
    third.add(9);
    third.add(12);
    third.add(15);
    main.add(third);

    for(int i=0; i<main.size();i++){
        ArrayList<Integer>currlist=main.get(i);
        for(int j=0;j<currlist.size();j++){
            System.out.print(currlist.get(j)+" ");
        }
        System.out.println();
    }
    System.out.println(main);
    

    }
}
