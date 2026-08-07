class Solution { 
    public void gameOfLife(int[][] board) { 
        int[][] copy = new int[board.length][board[0].length];
        for(int i=0; i<board.length; i++) {
            copy[i] = board[i].clone();
        }

        for(int i=0; i<board.length; i++){ 
            for(int j=0; j<board[0].length; j++){ 
                check(copy, board, i, j); 
            } 
        } 
    } 

    public void check(int[][] copy, int[][] board, int i, int j){ 
        int m = copy.length;
        int n = copy[0].length;
        int count = 0; 

        if (i + 1 < m  && copy[i+1][j] == 1) count++; 
        if (i - 1 >= 0 && copy[i-1][j] == 1) count++; 
        if (j + 1 < n  && copy[i][j+1] == 1) count++; 
        if (j - 1 >= 0 && copy[i][j-1] == 1) count++; 
        
        if (i + 1 < m  && j + 1 < n  && copy[i+1][j+1] == 1) count++;
        if (i + 1 < m  && j - 1 >= 0 && copy[i+1][j-1] == 1) count++;
        if (i - 1 >= 0 && j + 1 < n  && copy[i-1][j+1] == 1) count++;
        if (i - 1 >= 0 && j - 1 >= 0 && copy[i-1][j-1] == 1) count++;

        if (copy[i][j] == 1) {
            if (count < 2 || count > 3) {
                board[i][j] = 0;
            }
        } else {
            if (count == 3) {
                board[i][j] = 1;
            }
        }
    } 
}
