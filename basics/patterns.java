import java.util.Scanner;

import javax.xml.transform.Source;
public class patterns {
    public static void ro_inver_tria(int k){
            int n = k;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void inver_half_pyramid(int k){
        int n = k;
        for(int i = 0; i<n; i++){
            int count = 1;
            for(int j=1; j<=n-i; j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
    public static void Floyed_triangle(int n){
        int count = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void zero_one_triangle(int n){
        // int count=1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
               if((i+j)%2==0){
                   System.out.print("1");
               }
               else{
                   System.out.print("0");
               }
            }
            System.out.println();
        }
    }
    public static void butterfly(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=2*n; j++){
                if(j<=i || j>(2*n)-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=(2*n); j++){
                if(j<=i || j>(2*n)-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void solid_rhombus(int n){
        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=(2*n)-i; j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            for(int j = 1; j<=(2*n)-i; j++){
                if(j<=(n-i)){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void hollow_rhoumbus(int n){
        
        for (int i = 1; i<=n; i++){
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        // ro_inver_tria(p);
        // inver_half_pyramid(p);
        // Floyed_triangle(p);
        // zero_one_triangle(p);
        // butterfly(p);
        // solid_rhombus(p);
        // solid_rhombus(p);
        // solid_rhombus(p);
        hollow_rhoumbus(p);
       
    }
    
}
