class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> op=new ArrayList<>();
        partition(0,s,op,res);
        return res;
        
    }
    public void partition(int i,String s, List<String> op,List<List<String>> res)
    {
        if(i>=s.length())
        {
            res.add(new ArrayList<String>(op));
            return;
        }
        for(int j=i;j<s.length();j++)
        {
            String part=s.substring(i,j+1);
            if(isPali(part))
            {
                op.add(part);
                partition(j+1,s,op,res);
                op.remove(op.size()-1);

            }
        }

    }
    public boolean isPali(String s)
    {
        int l=0,r=s.length()-1;
        while(l<=r)
        {
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}