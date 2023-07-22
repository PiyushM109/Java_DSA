import java.util.*;
public class union_intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,9,2,};
        int[] nums2 = {2,3,9,4,5,6,9,2,4,6};
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            set2.add(nums2[i]);
        }
        HashSet<Integer> union = new HashSet<>();
        for(Integer num:set1){
            union.add(num);
        }
        for(Integer num:set2){
            union.add(num);
        }
        System.out.println("Union of two Arrays: "+union);
        HashSet<Integer> inter = new HashSet<>();
        for (Integer num : set1) {
            if(set2.contains(num)){
                inter.add(num);
            }
        }
        System.out.println("Intersection of two Arrays: "+inter);

    }
}
