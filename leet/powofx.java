public class powofx {
    public static int pow(int x, int n){
        int powr;
        if(n==0){
            return 1;
        }
        int m;
        if(n>0){
            m = pow(x, n/2);
        }
        else{
            m = 1/pow(x,n/2);
        }
        if(n%2==0){
            
            powr = m*m;
        }else{
            
            powr = x*m*m;
        }
        return powr;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, -5));
    }
}
