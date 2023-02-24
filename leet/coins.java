import java.util.*;

public class coins {
    public static int arrangeCoins(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int p = n;
        int i = 1;
        while (n > 0) {
            if (n > i) {
                int temp = i;
                list.add(temp);
                n = n - i;
                i++;
            } else {
                list.add(n);
                break;
            }
        }
        System.out.println(list);
        int stair = 0;
        for (int j = 0; j < p; j++) {
            if ((j + 1) == list.get(j)) {
                stair++;
                continue;
            } else {
                return stair;
            }
        }
        return stair;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
}