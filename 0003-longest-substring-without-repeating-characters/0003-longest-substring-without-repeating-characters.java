class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        while(r<s.length())
        {
            if(hm.containsKey(s.charAt(r)) && l<=hm.get(s.charAt(r)))
            {
                l=hm.get(s.charAt(r))+1;
            }
            hm.put(s.charAt(r),r);
            max=Math.max(r-l+1,max);
            r++;
        }
        return max;
        
    }
}