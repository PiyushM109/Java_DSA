import java.util.Scanner;
public class product_meth {
    public static int prod(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int p = prod(m, n);
        System.out.println(p);
    }
    
}
