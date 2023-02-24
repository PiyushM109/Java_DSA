import java.util.ArrayList;
public class subsequences {
    public static void sub(int i,ArrayList<Integer> List, int[] nums, int n){
        if(i==n){
            System.out.println(List);
            return ;
        }
        List.add(nums[i]);
        sub(i+1, List, nums, n);
        List.remove(List.size()-1);

        sub(i+1, List, nums, n);
    }
    public static void main(String[] args) {
        int[] nums= {3,2,1};
        int n=3;
        ArrayList<Integer> list = new ArrayList<>();
        sub(0,list,nums,n);

    }
}
