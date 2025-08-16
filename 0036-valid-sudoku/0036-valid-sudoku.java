class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len=board.length;
        HashSet<Character> [] rh=new HashSet[len];
        HashSet<Character> [] ch=new HashSet[len];
        HashSet<Character> [] sh=new HashSet[len];

        for(int row=0;row<9;row++)
        {
            for(int col=0;col<9;col++)
            {
                if(board[row][col]!='.')
                {
                    if(rh[row]==null)rh[row]=new HashSet<Character>();
                    if(!rh[row].add(board[row][col]))return false;

                    if(ch[col]==null)ch[col]=new HashSet<Character>();
                    if(!ch[col].add(board[row][col]))return false;

                    int idx=(row/3)*3+(col/3);
                    if(sh[idx]==null)sh[idx]=new HashSet<Character>();
                    if(!sh[idx].add(board[row][col]))return false;


                }
            }
        }
        return true;
        
    }
}