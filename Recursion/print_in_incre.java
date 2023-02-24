public class print_in_incre {
    public static void Printincre(int n){
        if(n==1){
           System.out.print(n+" ");
           return;
        }
        Printincre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        Printincre(n);
    }
}
