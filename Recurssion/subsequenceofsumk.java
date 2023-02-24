import java.util.ArrayList;
public class subsequenceofsumk {
    public static boolean sub(int i,ArrayList<Integer> list, int[] nums, int n, int k, int sum){
        
        if(i==n){
            if(sum==k){
                System.out.println(list);
                return true;
            }
            return false ;
        }
        list.add(nums[i]);
        sum = sum+nums[i];
        if(sub(i+1, list, nums, n, k, sum) ==true){
            return true;
        }
        sum = sum-list.get(list.size()-1);
        list.remove(list.size()-1);

        if(sub(i+1, list, nums, n, k, sum)==true){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4,1,2};
        ArrayList<Integer> list = new ArrayList<>();
        sub(0, list, nums, nums.length, 4, 0);
    }
}
