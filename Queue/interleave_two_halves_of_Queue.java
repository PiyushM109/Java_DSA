import java.util.*;
public class interleave_two_halves_of_Queue{
    public static void interleave(Queue Q){
        Queue ql = new LinkedList<>();
        Queue qr = new LinkedList<>();
        int n = Q.size();
        int i=0;
        while(i<n/2){
            ql.add(Q.remove());
            i++;
        }
        int  j= 0;
        while(!ql.isEmpty()){
                Q.add(ql.remove());
                Q.add(Q.remove());
        }
        System.out.println(Q);
    }
    public static void main(String[] args) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(1);
        Q.add(2);
        Q.add(3);
        Q.add(4);
        Q.add(5);
        Q.add(6);
        Q.add(7);
        Q.add(8);
        Q.add(9);
        Q.add(10);
        interleave(Q);
    }
}