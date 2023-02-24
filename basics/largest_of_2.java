import java.util.Scanner;
public class largest_of_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int  y= sc.nextInt();
        if(x>y){
            System.out.println(x+" is largest Number");
        }
        else{
            System.out.println(y+" is largest Number");
        }
    }
    
}
