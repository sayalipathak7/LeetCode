class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String s:strs)
        {
            //sort
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String ss=new String(ch);
            if(!hm.containsKey(ss)) hm.put(ss,new ArrayList<String>());
            hm.get(ss).add(s);
        }
        for(ArrayList<String>l:hm.values())
        {
            res.add(l);
        }
        return res;

        
    }
}