import java.util.*;

public class dec_to_binary {
        public static int makeitbi(int dec){
            int binar = 0, pow = 0;
            while(dec>0){
                int rem = dec%2;
                binar = binar + (rem*(int)Math.pow(10, pow));
                pow++;
                dec= dec/2;
            }
            return binar;
        }
        public static void main(String[] args) {
            System.out.println(makeitbi(9));
        }
}
