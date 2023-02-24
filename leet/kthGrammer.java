public class kthGrammer {
    public static char kth(int n, int k){
        String str = "0";
        for(int i=0; i<n; i++){
            String newstr = " ";
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='0'){
                    newstr.replace("0", "01");
                }
                else if(str.charAt(j)=='1'){
                    newstr.replace("0", "10");
                }
            }
            str = newstr;
        }
        char ch = str.charAt(k+1);
        return ch;
    }
    public static void main(String[] args) {
        System.out.println(kth(1,1));
    }
}
