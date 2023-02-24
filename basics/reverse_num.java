import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        while(n>0){
            int j = n%10;
            m = (m*10)+j;
            n = n/10;
        }
        System.out.println(m);
    }
}
