class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(char c:s.toCharArray())
            h.put(c,h.getOrDefault(c,0)+1);

        for(char c:t.toCharArray())
            h.put(c,h.getOrDefault(c,0)-1);

        for(int v:h.values())
        {
            if(v!=0)return false;
        }
        return true;
        
        
        
    }
}