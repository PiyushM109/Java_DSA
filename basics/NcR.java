public class NcR {
    public static int facto(int p){
        int n = 1;
        for(int i = 1; i<=p; i++){
            n = n*i;
        }
        return n;
    }
    public static int ncr(int n, int r){
        int c = facto(n)/(facto(r)*facto((n-r)));
        return c;
    } 
    public static void main(String[] args) {
        System.out.println(ncr(5,2));
    }
}
