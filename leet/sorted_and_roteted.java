public class sorted_and_roteted {
    
    public static boolean sorted(int[] nums){
        boolean flag = false; 
        int i=0;
        for(i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                flag = true;
                break;
            }
        }

        if(flag==true){
            int size = nums.length;
            int j = i+1;
            i= i+2;
            while(j!=((size+i)%size)){
                int k = 
                if(nums[i]>=nums[i+1]){
                    flag = false;
                }
                i++;
            }
        }
        return flag;
    }

    public static void main(String[] args) {   
        int[] nums = {4,5,6,1,2,3};
        System.out.println(sorted(nums));
    }
}
