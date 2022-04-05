
class Sudoku {
    
    public static void sudokuSolver(int i ,int j ,char[][]board ,int[][]rowFreq ,int[][]colFreq,int[][]matFreq,boolean ansfound,char[][]board1){
      
        boolean flag = false;
        if(flag){
            return ;
        }
        if(i==9){
           flag = true;
            for(int a = 0;a<9;a++){
                for(int b = 0;b<9;b++){
                   System.out.print(board1[a][b]+" ");
                }
                 System.out.println();
            }
            return ;
        }
   // 0,0,board,rowFreq,colFreq,matFreq,ansfound,board1

        if(board[i][j]!='.'){
            if(j<8){
                sudokuSolver(i, j+1, board,rowFreq,colFreq,matFreq,ansfound,board1);
            }  
            if(j==8){
                sudokuSolver(i+1, j, board,rowFreq,colFreq,matFreq,ansfound,board1);

            }
        } 
            int matnum = getMatrixNumber(i,j);
            for(int index=1;index<=9;index++){
            
                    if(rowFreq[i][index-1]==0 && colFreq[j][index-1]==0 && matFreq[matnum][index-1]==0){
                        board1[i][j]= Integer.toString(index).charAt(0);
                        rowFreq[i][index-1]=1 ;  colFreq[j][index-1]=1;  matFreq[matnum][index-1]=1;
                        if(j<8){
                            sudokuSolver(i, j+1, board,rowFreq,colFreq,matFreq,ansfound,board1);
                        }  
                        if(j==8){
                            sudokuSolver(i+1, j, board,rowFreq,colFreq,matFreq,ansfound,board1);
            
                        }
                        board1[i][j]= '.';
                        rowFreq[i][index-1]=0 ;  colFreq[j][index-1]=0;  matFreq[matnum][index-1]=0;
    
                    }
                
    
        }
       
        return ;
    }
     public static  int getMatrixNumber(int x, int y){

        if(x<3){

            if(y<3){

                return 0;

            }else if(y>3 && y<6){

                return 1;

            }else{

                return 2;

            }

        }else if(x>3 && x<6){

            if(y<3){

                return 3;

            }else if(y>3 && y<6){

                return 4;

            }else{

                return 5;

            }

        }else{

            if(y<3){

                return 6;

            }else if(y>3 && y<6){

                return 7;

            }else{

                return 8;

            }

    }
}
   public static  void solveSudoku(char[][] board) {
      int rowFreq [][] = new int[9][9];
       int colFreq [][] = new int[9][9];
      int matFreq [][] = new int[9][9];
      char board1[][] = new char[9][9];
     boolean ansfound = false;
       for(int i = 0;i<9;i++){
           for(int j = 0;j<9;j++){
               board1[i][j]=board[i][j];
               if(board[i][j]!='.'){
                rowFreq[i][Character.getNumericValue(board[i][j])-1]++;
                colFreq[Character.getNumericValue(board[i][j])-1][j]++;
                int matnum = getMatrixNumber(i, j);
                matFreq[matnum][Character.getNumericValue(board[i][j])-1]++;
               }
           }
       }
    sudokuSolver(0,0,board,rowFreq,colFreq,matFreq,ansfound,board1);
    return ;
    }


    public static void main(String args[]){
        char board [][] = 
           {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},

           {'6', '.', '.', '1', '9', '5', '.', '.', '.'},

           {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

           {'8', '.', '.', '.', '6', '.', '.', '.', '3'},

           {'4', '.', '.', '8', '.', '3', '.', '.', '1'},

           {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

           {'.', '6', '.', '.', '.', '.', '2', '8', '.'},

           {'.', '.', '.', '4', '1', '9', '.', '.', '5'},

           {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        solveSudoku(board);
        System.out.println(board[0][3]);
    }
}