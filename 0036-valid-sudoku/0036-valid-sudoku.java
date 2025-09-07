class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> [] rows=new HashSet[9];
        HashSet<Character> [] cols=new HashSet[9];
        HashSet<Character> [] sqs=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            sqs[i]=new HashSet<>();
        }
        for(int r=0;r<9;r++)
        {
            for(int c=0;c<9;c++)
            {
                if(board[r][c]=='.')continue;

                if(rows[r].contains(board[r][c]))return false;
                rows[r].add(board[r][c]);

                if(cols[c].contains(board[r][c])) return false;
                cols[c].add(board[r][c]);

                int sq= r/3*3+c/3;
                if(sqs[sq].contains(board[r][c]))return false;
                sqs[sq].add(board[r][c]);

            }
        }
        return true;
        
    }
}