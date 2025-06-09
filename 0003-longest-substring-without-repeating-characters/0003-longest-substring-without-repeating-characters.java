class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0,r=0,max=0;
        while(r<s.length())
        {
            
            if(hm.containsKey(s.charAt(r)) && l<=hm.get(s.charAt(r)))
            {
                l=hm.get(s.charAt(r))+1;
            }
            hm.put(s.charAt(r),r);
            
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
        
    }
}