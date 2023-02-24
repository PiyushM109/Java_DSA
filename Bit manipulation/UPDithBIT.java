public class UPDithBIT {
    public static int ithbit(int n, int bit, int i){
        int bitmask = (bit<<i);
        return n | bitmask;
    }
    public static void main(String[] args) {
        System.out.println(ithbit(10, 1, 2));
    }
    
}
