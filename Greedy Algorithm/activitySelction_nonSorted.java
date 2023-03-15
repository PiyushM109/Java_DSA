import java.util.*;
public class activitySelction_nonSorted {
    public static void main(String[] args) {
        int[] start = {1, 3, 2, 5};
        int[] end =  {2, 4, 3, 6};

        int[][] activities = new int[start.length][3];

        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> list = new ArrayList<>();
        int maxAct = 1;
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=0; i<start.length; i++){
            if(activities[i][1]>lastEnd){
                maxAct++;
                list.add(activities[i][0]);
                lastEnd = activities[i][2];

            }
        }

        System.out.println(maxAct);
        System.out.println(list);

    }
}
