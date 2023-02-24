public class X_to_the_power_n {
    public static int xton(int x, int n){
        if(n==0){
            return 1;
        }
        int Xnm1 = xton(x,n-1);
        int m = x*Xnm1;
        return m;
    }
    public static void main(String[] args) {
        System.out.println(xton(2, 10));
    }
}
