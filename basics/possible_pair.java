public class possible_pair {
    public static void pair(int array[]){
        for(int i = 0; i<array.length-1; i++){
            for(int j = i+1; j<array.length; j++){
                System.out.print("(" +array[i] +"," +array[j]+") ");
            }
            System.out.println();
        }
    }
    public static void subarray(int array[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<array.length; i++){
            for(int j = i; j<array.length; j++){
                int sum = 0;
                for(int p = i; p<=j; p++){
                    System.out.print(array[p]+" ");
                    sum = sum+array[p];
                }
                System.out.print("Sum is : "+sum);
                if(max<=sum){
                    max = sum;
                }
                if(min>=sum){
                    min = sum;
                }
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("Max ix: "+max);
        System.out.println("Min ix: "+min);
    }
    public static void main(String[] args) {
        int marks[]={12,34,56,78,90};
        subarray(marks);
    }
}
