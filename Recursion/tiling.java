public class tiling {
    public static int tilingprob(int n){
        if(n==0 && n==1){
            return 1;
        }
        //vertical 
        int tnm1 = tilingprob(n-1);

        //horizontal
        int tnm2 = tilingprob(n-2);

        int totalways = tnm1+tnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingprob(5));
    }
}
