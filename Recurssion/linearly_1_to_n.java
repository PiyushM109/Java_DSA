public class linearly_1_to_n {
    public static void oneton(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        oneton(n-1);
        System.out.println(n);
    }
    public static void ntoone(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        ntoone(n-1);
    }
    public static void main(String[] args) {
        oneton(5);
        ntoone(5);
    }
}
