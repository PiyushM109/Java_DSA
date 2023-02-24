public class prefix_sum {
    public static void prefix(int array[]){
        int pref_ix[] = new int[array.length];
        for(int i = 0; i<array.length; i++){
            if(i!=0){
            pref_ix[i] = pref_ix[i-1]+array[i];}
            else{
                pref_ix[i]=array[i];
            }
        }
        for(int i=0; i<array.length; i++){
            for(int j = 0; j<array.length; j)
        }
    }
    public static void main(String[] args) {
        int marks[] = {10,22,45,67};
        prefix(marks);

    }
}
