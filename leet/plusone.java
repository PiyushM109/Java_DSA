public class plusone{
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int[] ans = new int[n+1];
        ans[1]=0;
        return ans;
        
        
    }
    public static void display(int[] nums){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        plusOne(digits);
        // int num = 0;
        // for(int i=0; i<digits.length; i++){
        //     num = num*10;
        //     num = num+digits[i];
        // }
        // num = num+1;
        // System.out.println(num);
        // int[] ans = new int[digits.length];
        // for(int i=ans.length-1; i>=0; i--){
        //     ans[i]=num%10;
        //     num = num/10;
        // }
        // display(digits);
       
        
        
    }

}