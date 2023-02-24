import java.util.*;
public class copymatrix {
    
    public static void creat(int[][] nums){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        display(nums);
    }
    public static void display(int[][] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void copymat(int[][] nums){
        int row = nums.length;
        int col = nums[0].length;
        int[][] mat2 = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat2[i][j] = nums[i][j];
            }
        }
        display(mat2);
    }
    public static void tranpose(int[][] nums){
        int[][] mat = new int[nums.length][nums[0].length];
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums[0].length; j++){
                mat[j][i] =nums[i][j]; 
            }
        }
        display(mat);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int col = sc.nextInt();
        int[][] nums = new int[row][col];
        creat(nums);
        // System.out.println("Mat2 is");
        // copymat(nums);
        // System.out.println(nums.length);
        // System.out.println(nums[0].length);
        tranpose(nums);

        
    }
}
