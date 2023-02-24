public class remove_duplicates {
    public static void remove(String str, StringBuilder newstr, boolean map[],int indx ){
        if(indx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(indx);
        if(map[currchar-'a']==true){
            remove(str, newstr, map, indx+1);
        }
        else{
            map[currchar-'a']=true;
            remove(str, newstr.append(currchar), map, indx+1);
        }
    }
    public static void main(String[] args) {
        String strg = "aapnnacollege";
        StringBuilder newstrg = new StringBuilder(strg.length());
        boolean map[] = new boolean[26];
        int indxe = 0;
        remove(strg, newstrg, map, indxe);
    }
}
