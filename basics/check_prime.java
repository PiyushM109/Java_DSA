import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for(int i = 2; i<Math.sqrt(n); i++){
            if(n%i==0){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
