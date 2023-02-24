import java.util.*;
public class reverse_integer {
    public static int reverse(int x){
        // ArrayList<Integer> number = new ArrayList<>();
        int n = Math.abs(x);
        int p = 0;
        while(n>0){
            int num = n%10;
            p = (p*10)+num;
            n = n/10;
        }
        if(x<0){
            return -p;
        }

        return p;
    }
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }
}
