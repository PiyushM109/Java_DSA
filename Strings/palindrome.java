public class palindrome {
    public static boolean check_palindrome(String str){
        
        int n =str.length();
        for(int i= 0; i<=(n/2); i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String stri = "piyushsuyip";
        System.out.println(check_palindrome(stri));
    }
    
}
