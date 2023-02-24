import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        year = year%100;
        if(year%4 == 0){
            System.out.println("This is leap year");
        }else{
            System.out.println("this is not leap year");
        }
    }
    
}
