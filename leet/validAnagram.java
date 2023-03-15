import java.util.*;
public class validAnagram {
    public static  boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        for(int i=0; i<sarr.length; i++){
            if(sarr[i]!=tarr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }
}
