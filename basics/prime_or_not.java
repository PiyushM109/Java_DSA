import java.util.Scanner;
import java.lang.Math;
public class prime_or_not {
    public static void prime(int n){
        boolean flag = true;
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        prime(m);
    }
}
