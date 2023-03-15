import java.util.*;
public class absolute_difference_ppairs{
    public static int minimumAbsoluteDiff(int[] num1, int[] num2){
        if(num1.length != num2.length){
            return -1;
        }
        Arrays.sort(num1);
        Arrays.sort(num2);
        int ans = 0;
        for(int i=0; i<num1.length; i++){
            ans = ans + Math.abs(num1[i]-num2[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {2,3,1};
        System.out.println(minimumAbsoluteDiff(num1, num2));
    }
}