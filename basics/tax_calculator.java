import java.util.Scanner;

public class tax_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int tax = 0;
        if (salary < 500000) {
            System.out.println(salary);
        } else if (salary >= 500000 && salary < 1000000) {
            tax = (salary * 20) / 100;
            salary -= tax;

            System.out.println(salary);
        } else {
            tax = (salary * 20) / 100;
            salary -= tax;

            System.out.println(salary);
        }
        System.out.println("Total tax paid is: " +tax);
        
    }
}
