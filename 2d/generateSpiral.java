public class generateSpiral {
    public static void createspiral(int n){
        int[][] ans = new int[n][n];
        int p=1;
        int sr=0;
        int sc=0;
        int er=ans.length-1;
        int ec=ans[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int i=sc; i<=ec; i++){
                ans[sr][i] = p;
                p++; 
            }

            //left
            for(int j=sr+1; j<=er; j++){
                ans[j][ec] = p;
                p++; 
            }

            //bottom
            for(int i=ec-1; i>=sc; i--){
                if(sr==er){
                    break;
                }
                ans[er][i] = p;
                p++;
            }
             
            //right
            for(int j=er-1; j>=sr+1; j--){
                if(sc==ec){
                    break;
                }
                ans[j][sc] = p;
                p++;
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        display(ans);
    }
    public static void display(int[][] ans){
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        createspiral(3);
    }
}
