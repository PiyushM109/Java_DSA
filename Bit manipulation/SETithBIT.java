public class SETithBIT {
    public static int ithbit(int n, int i){
        int bitmask = (1<<i);
        int ans = (n | bitmask);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ithbit(3, 2));
    }
}
