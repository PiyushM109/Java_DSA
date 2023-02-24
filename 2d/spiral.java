import java.util.*;

public class spiral {
    public static void generatespiral(ArrayList<Integer> list, int n){
        int[][] ans = new int[n][n];
        int p=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = list.get(p);
                p++;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void create(int[][] matrix){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        createspiral(matrix);
    }
    public static void createspiral(int[][] matrix){
        ArrayList<Integer> list = new ArrayList<>();
        int sr =0;
        int er = matrix.length-1;
        int sc = 0;
        int ec = matrix[0].length-1;
        while(sr<=er && sc<=ec){
            //top
            for(int j=sc; j<=ec; j++){
                list.add(matrix[sr][j]);
            }
            //right
            for(int i=sr+1; i<=er; i++){
                list.add(matrix[i][ec]);
            }
            //bottom
            for(int j=ec-1; j>=sc;j--){
                if(sr==er){
                    break;
                }
                list.add(matrix[er][j]);
            }
            //left
            for(int i=er-1; i>sr; i--){
                if(sc==ec){
                    break;
                }
                list.add(matrix[i][sc]);
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
        System.out.println(list);
        generatespiral(list, 3);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int col =sc.nextInt();
        int[][] matrix  = new int[row][col];
        create(matrix);
        
    }
}
