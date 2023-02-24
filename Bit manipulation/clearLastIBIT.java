public class clearLastIBIT {
    public static int LastIbit(int n, int i){
        int bitmask = ((~0)<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(LastIbit(15, 2));
    }
}
