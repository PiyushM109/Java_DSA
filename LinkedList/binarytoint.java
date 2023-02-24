public class binarytoint {
    public static long convert(long bin){
        long ans= 0;
        long base = 1;
        while(bin>0){
            long temp = bin%10;
            bin = bin/10;
            ans = ans+(temp*base);
            base = base*2;
        }
        return ans;
    }
    public static void main(String[] args) {
        long bi = 100100111000000;
        System.out.println(convert(bi));
    }
}
