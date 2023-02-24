public class trapping_of_rainwater {
    public static int volume(int Array[]){
        //Claculate left max
        int leftmax[] = new int[Array.length];
        leftmax[0] = Array[0];
        for(int i = 1; i<Array.length; i++){
            leftmax[i]=Math.max(Array[i], leftmax[i-1]);}
       
        //calculate Rightmax
        int rightmax[]= new int[Array.length];
        rightmax[Array.length-1]=Array[Array.length-1];
        for(int j = Array.length-2; j>=0; j--){
            rightmax[j]=Math.max(Array[j], rightmax[j+ 1]);
        }
        
        
        //Claculate water level
        int waterl, total =0;
        for(int p = 1; p<Array.length; p++){
            waterl = Math.min(leftmax[p], rightmax[p]);
            total += waterl-Array[p];
        }
        return total;
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
       
        System.out.println();
        System.out.println(volume(height));
    }
    
}
