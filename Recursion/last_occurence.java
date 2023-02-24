import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class last_occurence {
    public static int lastocu(int arr[], int key, int i){
       if(i==arr.length){
           return -1;
       }
       int isFound = lastocu(arr, key, i+1);
       if(isFound==-1 && arr[i]==key){
           return i;
       }

       return isFound;
    }
    public static void main(String[] args) {
        int array[] = {7,8,7,5,9,1,9,7,6,6};
        System.out.println(lastocu(array,6,0));
    }
}
