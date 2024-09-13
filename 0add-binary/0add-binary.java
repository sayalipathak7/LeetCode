class Solution {
    public String addBinary(String a, String b) {
        int rem=0;
        int add=0;
        StringBuilder res=new StringBuilder();
        int al=a.length()-1,bl=b.length()-1;
        while(al>=0 && bl>=0)
        {
            add=a.charAt(al)-'0'+b.charAt(bl)-'0'+rem;
            res=res.append(add%2);
            rem=add/2;
        
            al--;
            bl--;
        }
        while(al>=0)
        {
            add=a.charAt(al)-'0'+rem;
            res=res.append(add%2);
            rem=add/2;
            al--;
        }
        while(bl>=0)
        {
            add=b.charAt(bl)-'0'+rem;
            res=res.append(add%2);
            rem=add/2;
            bl--;
        }
        if(rem==1)
            res=res.append(rem);
        return res.reverse().toString();
        
    }
}