import java.util.*;
import java.lang.Math;
public class bi_to_dec {
    public static int binaryTOdecimal(int bina) {
        int decnum = 0, pow=0;
        while(bina>0){
            int lastdigi = bina%10;
            decnum = decnum + (lastdigi*(int)Math.pow(2, pow));
            pow++;
            bina = bina/10;
        }

        return decnum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        
        System.out.println("decimal number of given binary is "+binaryTOdecimal(m));
    }
}
