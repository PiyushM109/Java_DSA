public class find_subsets {
    public static void subsets(String str, String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //yes
        subsets(str, ans+str.charAt(i), i+1);

        //No
        subsets(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        subsets(str, ans, 0);
    }
}
