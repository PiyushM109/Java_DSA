class num_in_desc{
    public static void desc(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num);
        desc(num-1);
    
    }
    public static void main(String[] args) {
        int n = 10;
        desc(n);
    }
}