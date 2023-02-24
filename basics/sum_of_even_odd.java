import java.util.Scanner;
public class sum_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int evensum = 0, oddsum=0 ,flag = 1;
        while(flag==1){
            System.out.println("Enter the number: ");
            n = sc.nextInt();
            if(n%2==0){
                evensum +=n;
            }
            else{
                oddsum +=n;
            }

            System.out.println("If you want to enter another number press 1:");
            flag = sc.nextInt();
        }
        System.out.println("Sum of Even Number is:"+evensum);
        System.out.println("Sum of odd Number is:"+oddsum);
    }
    
}
