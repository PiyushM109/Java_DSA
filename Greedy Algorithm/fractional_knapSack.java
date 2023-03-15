import java.util.*;
public class fractional_knapSack {
    public static double fractionlknapsack(int[] value, int[] weight, Double w){
        int[] ratio = new int[value.length];
        for(int i=0; i<ratio.length; i++){
            ratio[i] = value[i]/weight[i];
        }
        double[][] stat = new double[value.length][4];
        for(int i=0; i<value.length; i++){
            stat[i][0] = i;
            stat[i][1] = value[i];
            stat[i][2] = weight[i];
            stat[i][3] = ratio[i];
        }
        Arrays.sort(stat, Comparator.comparingDouble(o->o[3]));
        for(int i=0; i<stat.length; i++){
            for(int j=0; j<4; j++){
                System.out.print(stat[i][j]+" ");
            }
            System.out.println();
        }
        double ans = 0;
            
                for(int j=value.length-1; j>=0; j--){
                    if(stat[j][2]<=w){
                        ans = ans + stat[j][1];
                        w = w - stat[j][2];
                    }
                    else if(w>0 && stat[j][2]>w){
                        ans =ans + (w*stat[j][3]);
                        w = 0.0;
                    }
                }
            
        return ans;
    }
    public static void main(String[] args) {
        int[] value = {60,100,120};
        int[] weight = {10,20,30};
        double W = 50;
        int w = 50;
        System.out.println(fractionlknapsack(value, weight, W));
        double ratio[][] = new double[value.length][2];

        for(int i=0; i<value.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int capacity = w;
        int finalvalue = 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalvalue += value[idx];
                capacity -= weight[idx];
            } 
            else{
                finalvalue +=(ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("Final Value is:"+ finalvalue);

    }
}
