class Solution {
    public boolean exist(char[][] board, String word) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(exist(i,j,board,0,word))
                return true;
            }
        }
        return false;
      
        
        
    }
    public boolean exist(int r,int c,char[][] board,int idx,String word)
    {
        if(idx==word.length())return true;
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c]!=word.charAt(idx) || board[r][c]=='#')
        return false;
        board[r][c]='#';

        boolean res= exist(r,c+1,board,idx+1,word) ||
        exist(r,c-1,board,idx+1,word) ||
        exist(r+1,c,board,idx+1,word) ||
        exist(r-1,c,board,idx+1,word) ;
        board[r][c]=word.charAt(idx);
        return res;


    }
}