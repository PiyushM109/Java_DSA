import java.util.*;
public class max_len_chain {
    public static int maxChain(int[][] pairs){
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int mxLen = 1;
        int last = pairs[0][1];
        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0]>=last){
                mxLen++;
                last = pairs[i][1];
            }
        }
        return mxLen;
    }
    public static void main(String[] args) {
        int[][] pairs = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(maxChain(pairs));

    }
}
