public class reverse_array {
    public static void reverse(int array[]){
        for(int i = 0; i<=(array.length)/2; i++){
            int j = i+1;
            int temp = array[i];
            array[i]=array[(array.length)-j];
            array[(array.length)-j] = temp;
        }
    }
    public static void main(String[] args) {
        int marks[]={30,35,90,95,98};
        reverse(marks);
        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
    }
}
