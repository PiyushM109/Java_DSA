public class evenOrOdd {
     public static void eoro(int n) {
         int bitmask = 1;
         if((n & bitmask)==1){
             System.out.println("Odd");
         }
         else{
             System.out.println("Even");
         }
    }
    public static void main(String[] args) {
        int m = 16;
        eoro(m);
    }
}
