class Solution {
    public boolean isAnagram(String s, String t) {
        int [] cnt=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            cnt[idx]=cnt[idx]+1;
        }
        for(int i=0;i<t.length();i++)
        {
            int idx=t.charAt(i)-'a';
            cnt[idx]=cnt[idx]-1;
        }
        for(int i=0;i<26;i++)
        {
            if(cnt[i]!=0)return false;
        }
        return true;
        
    }
}