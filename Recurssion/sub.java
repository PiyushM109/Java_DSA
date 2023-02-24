import java.util.ArrayList;

public class sub {
    public static void combi(int i, int[] candidates, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> list1,
            int target) {
        if (i == candidates.length ) {
            if (target==0) {
                list.add(new ArrayList<>(list1));
            }
            return;
        }
        if(candidates[i] <= target){
        list1.add(candidates[i]);
        combi(i, candidates, list, list1, target-candidates[i]);
        list1.remove(list1.size()-1);
        }
        combi(i+1, candidates, list, list1, target);
    }

    public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ;
        
        combi(0, candidates, list, new ArrayList<>(), target);
        return list;

    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }
}
