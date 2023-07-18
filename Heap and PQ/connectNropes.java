import java.util.*;
public class connectNropes {
    public static void main(String[] args) {
        int [] ropes = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        int cost =0;
        while(!pq.isEmpty()){
            int x = pq.remove();
            int y = pq.remove();
            cost = cost + (x+y);
            if(!pq.isEmpty()){
                pq.add(x+y);
            }
        }
        System.out.println(cost);
    }
}
