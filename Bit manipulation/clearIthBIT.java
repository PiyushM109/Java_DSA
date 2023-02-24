public class clearIthBIT{
    public static int ithBit(int n, int i){
        int bitmask = ~(n<<i);
        int ans = (n & bitmask);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ithBit(7, 2));
    }
}