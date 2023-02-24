public class selection_sort {
    public static void Selec_sort(int Array[]){
        for(int i=0; i<Array.length-1; i++){
            int min = i;
            int p = -1;
            for(int j=i+1; j<Array.length; j++){
                if(Array[j]<Array[min]){
                    
                    min = j;
                }
            }
            int temp = Array[i];
            Array[i] = Array[min];
            Array[min] = temp;
            
        }
        for(int i =0 ; i<Array.length; i++){
            System.out.print(Array[i]+" ");
        }
    }
    public static void main(String[] args) {
       int array[] = {32,45,47,41,26,54,12,14,11,88,99};
    //    Selec_sort(array); 
    // System.out.println();
    for(int i =0 ; i<array.length-1; i++){
        System.out.print(i+" ");
    }
    }
}

