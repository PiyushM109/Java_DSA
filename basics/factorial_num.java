import java.util.Scanner;
public class factorial_num {
    public static double facto(int p){
        double n = 1;
        for(int i = 1; i<=p; i++){
            n = n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double factorial = facto(m);
        System.out.println("Factorial is "+factorial);
    }
}
