public class factorial {
    
    public static int fact(int n){
        if(n==0){ 
            return 1;
        }
        int num = n * fact(n-1);
        return num;
    }
    public static void main(String[] args) {
        int num =5 ;
        System.out.println( fact(num));
    }
}
