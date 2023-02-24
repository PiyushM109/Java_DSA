public class countsetbit {
    public static int countset(int n){
        int count =0;
        int bitmask = (1<<0);
        while(n>0){
            if((n&bitmask)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countset(14));
    }
}
