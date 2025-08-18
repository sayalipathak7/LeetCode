class Solution {
    public int countDistinct(String s) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {

                h.add(s.substring(i,j+1));
            }
        }
        return h.size();
        
    }
}