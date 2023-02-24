public class twelve {
    public static void twelvth(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=n-i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        twelvth(5);
    }
}
