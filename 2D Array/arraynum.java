import java.util.*;
public class arraynum {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int p = 0;
        int n = num,length-1;
        if(num[n]==9){
            int k=n;
            while(num[k]==9 && k){
                num[k]=0;
                k--;
            }
            if(num[0]==0){
                list.add(1);
                for(int i=0; i<=n; i++){
                    list.add(num[i]);
                }
                return list;
            }else{
                num[k] = num[k]+1;
            }
        }
        while(k>0){
            int temp = k%10;
            k=k/10;
            int[n-p] = int[n-p]+temp;
        }
    //     long number = 0;
    //     for(int i=0; i<num.length; i++){
    //         number = (number*10)+num[i];
    //     }
    //     System.out.println("The number before addition: "+number);
    //     number =number+k;
    //     System.out.println("The number after addition: "+number);

    //     while(number>0){
    //         int temp = (int)(number%10);
    //         System.out.println(temp);
    //         list.add(temp);
    //         System.out.println(number);
    //         number = number/10;
    //     }
    //     Collections.reverse(list);

  
        return list; 
    }
    public static void main(String[] args) {
        int[] nums = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        System.out.println(addToArrayForm(nums, 516));
    }
}
