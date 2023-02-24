
public class bubble_sort{
    public static void bub_sort(int Array[]){
        for(int i =0; i<Array.length-1; i++){
            for(int j=0; j<Array.length-1-i; j++){
                if(Array[j]>Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
            
        }
        for(int i =0 ; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int Array[] = {51,21,47,11,48,66,33,48,42,1};
        bub_sort(Array);
        
    }
}