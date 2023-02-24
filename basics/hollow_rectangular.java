import java.util.Scanner;
public class hollow_rectangular {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      for(int i = 1; i<=n; i++){
          if(i==1 || i==n){
              for(int j=1; j<=n; j++){
                  System.out.print("*");
              }
            }
           else{
               for(int p = 1; p<=n; p++){
                   if(p==1 || p==n){
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
               }
           }
           System.out.println();
      }
  }  
}
