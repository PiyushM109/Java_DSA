public class three {
    public static void pattern(int n){
        int m = n;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
            n--;
            if(n==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        pattern(6);
    }
}
