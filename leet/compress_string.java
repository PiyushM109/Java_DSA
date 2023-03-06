import java.util.*;
public class compress_string {
    public static int compress(char[] chars) {
        if(chars.length<=1){
            return chars.length;
        }
        StringBuilder str = new StringBuilder("");
        int i = 0;
        while(i<chars.length-1){
            if(i<chars.length-1 && chars[i]==chars[i+1]){
                char ch = chars[i];
                int count = 1;
                while(i<chars.length-1 && chars[i]==chars[i+1]){
                    count++;
                    i++;
                }
                str.append(ch);
                str.append(count);
            }
            else{
                str.append(chars[i]);
            }
            i++;
        }
        String s = str.toString();

        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        char[] chars = {'a' ,'a','b','b','b','b','c','c','c'};
        int y=compress(chars);
        System.out.println(y);
    }
}
