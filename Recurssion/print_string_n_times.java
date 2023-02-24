public class print_string_n_times{
    public static void ntimes(int n, String str){
        if(n==1){
            System.out.println(str);
            return;
        }
        System.out.println(str);
        ntimes(n-1,str);
    }
    public static void main(String[] args) {
        String name = "Piyush";
        ntimes(5, name);
    }
}