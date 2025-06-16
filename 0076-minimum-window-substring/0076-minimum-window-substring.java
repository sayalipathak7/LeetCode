class Solution {
    public String minWindow(String s, String t) {
        int reqCnt=t.length();
        int minLen=Integer.MAX_VALUE;
        String minString="";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:t.toCharArray()) hm.put(ch,hm.getOrDefault(ch,0)+1);

        int l=0,r=0;
        while(r<s.length())
        {
            if(hm.containsKey(s.charAt(r)))
            {
                if(hm.get(s.charAt(r))>0) reqCnt--;
                hm.put(s.charAt(r),hm.get(s.charAt(r))-1);
                
            }
            while(reqCnt==0)
            {
                if(minLen>r-l+1)
                {
                    minLen=r-l+1;
                    minString=s.substring(l,r+1);
                }
                if(hm.containsKey(s.charAt(l)))
                {
                    hm.put(s.charAt(l),hm.get(s.charAt(l))+1);
                    if(hm.get(s.charAt(l))>0)
                    {
                        reqCnt++;
                    }
                    
                }
                    l++;   
                
            }
            r++;
        }
        return minString;
        
    }
}