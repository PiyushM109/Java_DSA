public class ten{
    public static void tenth(int n){
        for(int i=0; i<n ; i++){
            for(int k=0; k<n-i; k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        tenth(5);
    }

}