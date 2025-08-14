class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sc=s.toCharArray();
        char[] tc=t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        s=new String(sc);
        t=new String(tc);
        return s.equals(t);

        
    }
}