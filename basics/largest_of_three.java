import java.util.Scanner;
public class largest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z){
            System.out.println(x);
        }
        else if(y>z){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }
    }
}
