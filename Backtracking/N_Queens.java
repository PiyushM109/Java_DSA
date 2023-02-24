public class N_Queens {
    static int count =0;
    public static void Queens(char board[][], int n) {
        if (n == board.length) {
            printboard(board);
            System.out.println();
            count++;
            return;
        }
        
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, i, n)) {
                board[n][i] = 'Q';
                Queens(board, n + 1);
                board[n][i] = 'x';
            }
        }
    }

    public static boolean isSafe(char board[][], int i, int n){
        //Vertically Up
        for(int j = n-1; j>=0; j--){
            if(board[j][i]=='Q'){
                return false;
            }
        }

        // Right up
        for(int j = n-1, p=i+1; j>=0 && p<board.length; j--,p++){
           
                if(board[j][p]=='Q'){
                    return false;
                
            }
        }
        //left up
        for(int j=n-1, p=i-1; j>=0 && p>=0; j--,p--){
            
                if(board[j][p]=='Q'){
                    return false;
                }
            
        }
        return true;
    }

    public static void printboard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        char chessboard[][] = new char[6][6];

        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard.length; j++) {
                chessboard[i][j] = 'x';
            }
        }
        // printboard(chessboard);
        Queens(chessboard, 0);
        System.out.println(count);
    }
}
