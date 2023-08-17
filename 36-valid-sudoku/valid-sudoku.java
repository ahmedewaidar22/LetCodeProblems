class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkrow(board) & checkcol(board) & check3(board) ;
    }
     
     private boolean checkrow(char[][] board){
                   Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!seen.add(b + i))
                    return false;
            }
        }
    }
            System.gc();

    return true;
     }
      private boolean checkcol(char[][] board){
                   Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!seen.add(j + b))
                    return false;
            }
        }
    }
      System.gc();
    return true;
     }
           private boolean check3(char[][] board){
                   Set seen = new HashSet();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!seen.add(i/3+b+j/3))
                    return false;
            }
        }

    }
            System.gc();

    return true;
     }
}