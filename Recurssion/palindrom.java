public class palindrom {
    public static void checkpalindrome(String str,int i, int n){
        if(i>n/2){
            System.out.println("It is a Palindrome");
            return ;
        }
        else if(str.charAt(i)==str.charAt(n-i)){
            checkpalindrome(str, i+1, n);
        }
        else{
            System.out.println("Not Palindrome");
            return ;
        }
        
    }
    public static void main(String[] args) {
        String str = "malayalam";
        int i=0; 
        int n = str.length()-1;
        checkpalindrome(str, i, n);
    }
}
