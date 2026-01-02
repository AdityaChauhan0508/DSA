public class twodarraypracticequestion {

    //Function to print spiral matrix
    public static void printSpiral(int matrix [][]) {
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol ; j++){
                System.out.print(matrix[startRow][j]+ " ");
            }

            //right
            for(int i=startRow+1 ; i<=endRow ; i++){
                System.out.print(matrix[i][endCol]+ " ");
            }

            //bottom
            for(int j=endCol-1 ; j>=startCol ; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+ " ");
            }

            //left
            for(int i=endRow-1 ; i>=startRow+1 ; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+ " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
       
    }


    //Fumction for Diagonal sum
    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        
        // for(int i=0; i<matrix.length; i++){  O(n^2)
        //     for(int j=0; j<matrix[0].length; j++){
        //         //primary diagonal
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         //secondary diagonal
        //         else if(i+j == 3){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }
        
        for(int i=0; i<matrix.length; i++){ //O(n)
            //primary diagonal
            sum += matrix[i][i];

            //secondary diagonal
            if(i != matrix.length-i-1)
                sum += matrix[i][matrix.length-i-1];
            }

            return sum;

        }


        //Function for Search in sorted matrix
        public static boolean staircaseSearch(int matrix[][] , int key){
            int row = 0 , col = matrix[0].length-1;

            while (row < matrix.length && col >= 0) {
                if(matrix[row][col] == key ){
                    System.out.println("FOund key at =  (" + row + "," + col +")");
                    return true;
                }
                else if(key < matrix[row][col]){
                    col--;
                }
                else{
                    row++;
                }
            }
            System.out.println("Key not found");
            return false;
        }


    

    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};   
        int key = 14;
        System.out.println("Spiral matrix");
        printSpiral(matrix);
        System.out.println();
        System.out.println( "Diagonal sum = " +diagonalSum(matrix));

        staircaseSearch(matrix, key);
        
    }
    
}
