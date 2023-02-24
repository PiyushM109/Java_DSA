public class kadanes_ {
    public static void maxsubarray(int array[]){
        int cs =0, ms=0;
        for(int i =0; i<array.length; i++){
            if((array[i]+cs)>=0){
                cs = cs+array[i];
                System.out.print("cs= "+cs+" ");
            }
            System.out.println();
            if((cs)>ms){
                ms = cs;
                System.out.print(ms+" ");            }
        }
        System.out.println();
        System.out.println("cs "+cs );
        System.out.println("ms "+ms );
    }
    public static void main(String[] args) {
        int marks[] = {-2,-3,4,-1,-2,1,5,3};
        maxsubarray(marks);
    }
    
}
