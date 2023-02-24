public class Rovedupli {
    public static void remove(String str){
        StringBuilder ans = new StringBuilder();
        boolean[] map = new boolean[26];
        for(int i =0; i<str.length(); i++){
            int n = str.charAt(i)-'a';
            if(map[n]==false){
                // ans.append(str.charAt(i));
                map[n] = true;
            }else{
                continue;
            }
        }
        for(int i = 0; i<26; i++){
            if(map[i]==true){
                char p = (char)(i+'a');
                ans.append(p);
            }
        }
         str = ans.toString();
        System.out.println(str);
    }

    public static void main(String[] args) {
        String str = "appnnacollege";
        remove(str);
    }
}
