import java.util.Scanner;
public class twoD {
    public static void display(int m, int n, int[][] nums){
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Darray(int m,int n, int nums[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        display(m,n,nums);
    }
    public static int oddcells(int m, int n, int[][] indices){
        for(int i=0; i<)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nums = new int[m][n];
        Darray(m,n,nums);
    }
}
