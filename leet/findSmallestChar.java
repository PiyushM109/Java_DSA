public class findSmallestChar {
    public static char find(char[] letters, char target){
        int min = Integer.MAX_VALUE;
        char p = 'a';
        boolean flag = false;
        for(int i=0; i<letters.length; i++){
            char temp = letters[i];
            
            if((temp-target) == 0){
                continue;
            }
            else if((temp-target)<min){
                System.out.println(temp-target);
                p = temp;
                min = temp-'a';
                flag = true;
            }
        }
        if(flag==true){
            return letters[0];
        }
        else{
            return p;
        }

    }
    public static void main(String[] args) {
        char[] letters = {'x','x','y','y'};
        System.out.println(find(letters, 'z'));
        
    }
}
