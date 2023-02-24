import java.util.*;
public class twod{
    public static void display(int[][] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void creation(int n, int m, int[][] nums){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                nums[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] nums = new int[n][m];
        // creation(n, m, nums);
        // display(nums);
        System.out.println(nums.length[]);
    }
}