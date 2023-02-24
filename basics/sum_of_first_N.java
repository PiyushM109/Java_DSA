import java.util.Scanner;
public class sum_of_first_N {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 1, sum = 0;
    while(count <= n){
        sum = sum+count;
        count++;
    }
    System.out.println(sum);
    }
    
}
