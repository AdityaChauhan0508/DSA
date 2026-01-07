public class NQueen {

    public static boolean isSafe(char board[][], int row, int col){
        //vertical up 
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++ ){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nqueens(char board[][] , int row){
        //base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nqueens(board, row+1); //function call
                board[row][j] = '.'; //backtracking step
            }
            
        }
    }

    public static void printBoard(char board[][]){
        System.out.println("----------chess board-------------");
        for (char[] board1 : board) {
            for (int j = 0; j<board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=8;
        char board[][] = new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nqueens(board, 0);
    }
    
}
