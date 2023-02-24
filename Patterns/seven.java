public class seven {
    public static void pattern(int n){
        int m = n;
        for(int i=0; i<m; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(4);
    }
}
