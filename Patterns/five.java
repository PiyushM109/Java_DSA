public class five {
    public static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        int m = n-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
