import java.util.Scanner;
public class tut2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Area of circle is 3.147*r
        System.out.println("Enter the radius of circle");
        float r = sc.nextFloat();
        float ar = (float) (r* r * 3.147);
        System.out.println("Area is " + ar);
    }
    
}
