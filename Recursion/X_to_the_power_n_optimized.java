public class X_to_the_power_n_optimized {
    public static int power(int x,int n){
        
        if(n==0){
            return 1;
        }
        int half = power(x, n/2);
        int m = half*half;
        if(n%2!=0){
            m =x *m;
            return m;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
