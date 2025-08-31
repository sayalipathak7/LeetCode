class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> [] rows=new HashSet[9];
        HashSet<Character> [] cols=new HashSet[9];
        HashSet<Character> [] sq=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            sq[i]=new HashSet<>();
        }
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                char num=board[i][j];
                if(num=='.')continue;
                //check row
                if(rows[i].contains(num)) return false;
                else rows[i].add(num);

                // check col
                if(cols[j].contains(num)) return false;
                else cols[j].add(num);

                //check sq
                int s=(i/3)*3+(j/3);
                if(sq[s].contains(num)) return false;
                else sq[s].add(num);

            }
        }
        return true;
        
    }
}