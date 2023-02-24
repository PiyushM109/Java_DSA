import java.util.Scanner;

public class lin_search {
    public static void insertion(int arr[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int linear_search(int arr[], int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largest_num(int arr[]) {
        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big) {
                big = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }

        }
        System.out.println("Largest value is: "+big);
        System.out.println("smallest value is: "+small);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[10];

        insertion(roll);
        display(roll);
        largest_num(roll);
        
        System.out.println("Enter the key that you want to search ");
        int key = sc.nextInt();
        System.out.println(linear_search(roll, key));

    }
}
