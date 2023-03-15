import java.util.*;
public class indian_coins {
    public static int change(int[] coins, int amount){
        ArrayList<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i=coins.length-1; i>=0; i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    list.add(coins[i]);
                    ans++;
                    amount = amount-coins[i];
                }
            }
        }
        System.out.println(list);
        return ans;
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,500,2000};
        int amount = 2688;
        System.out.println(change(coins, amount));

    }
}
