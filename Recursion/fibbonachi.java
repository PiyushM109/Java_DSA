public class fibbonachi {
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        int fibnm1 = fibo(n-1);
        int fibnm2 = fibo(n-2);
        int fibn = fibnm1 + fibnm2;
        return fibn;
        
    }
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    
}
