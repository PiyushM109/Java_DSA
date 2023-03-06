import java.util.*;
public class asteroid_collision {
    public static Stack<Integer> st = new Stack<>();
    public static int size = 0;
    public static void check(int peek, int temp){
        int diff = peek - Math.abs(temp);
        if(diff==0){
            st.pop();
            size--;
            return;
        }
        else if(diff<0){
            st.pop();
            size--;
            if(st.peek()>0){
                check(st.peek(), temp);
            }else{
                st.push(temp);
                size++;
                return;
            }
        }
    }

    public static int[] asteroidCollision(int[] asteroids) {
        for(int i=0; i<asteroids.length; i++){
            if(st.isEmpty()){
                st.push(asteroids[i]);
                size ++;
            }
            else if(st.peek()<0){
                st.push(asteroids[i]);
                size++;
            }
            else if(st.peek()>0 && asteroids[i]<0){
                check(st.peek(), asteroids[i]);
            }
            else{
                st.push(asteroids[i]);
                size++;
            }
        }
        int[] ans = new int[size];
        for(int i=0; i<size; i++){
            ans[i] = st.pop();
        }

        return ans;
    }
    
    public static void main(String[] args) {
        int[] asteroids = {10,2,-5};
        int[] ans = asteroidCollision(asteroids);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
