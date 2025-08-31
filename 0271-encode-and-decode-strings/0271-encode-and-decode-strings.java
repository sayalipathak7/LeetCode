public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs)
        {
            int len=s.length();
            sb.append(len).append("#").append(s);
        }

        return sb.toString();
        
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res=new ArrayList<>();
        int idx=0;
        int len=0;
        while(idx<s.length())
        {
            int i=idx;
            while(s.charAt(idx)!='#')
            {
                idx++;
            }
            len=Integer.parseInt(s.substring(i,idx));
            System.out.println(len);
            res.add(s.substring(idx+1,idx+1+len));
            idx=idx+1+len;

        }
        return res;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(strs));