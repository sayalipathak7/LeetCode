class Solution {
    public int countDistinct(String s) {
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            String str="";
            for(int j=i;j<s.length();j++)
            {
                str=str+s.charAt(j);
                h.add(str);
            }
        }
        return h.size();
        
    }
}