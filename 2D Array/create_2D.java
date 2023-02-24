import java.util.Scanner;
public class create_2D{
    public static void create(int Array[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<Array.length; i++){
            for(int j=0; j<Array[0].length; j++){
                Array[i][j] = sc.nextInt();
            }
        }
    }
    public static void display(int Array[][]){
        for(int i=0; i<Array.length; i++){
            for(int j=0; j<Array[0].length; j++){
                System.out.print(Array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        create(matrix);
        display(matrix);
    }
}