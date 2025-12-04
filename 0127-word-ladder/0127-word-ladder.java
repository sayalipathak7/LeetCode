class Pair<U,V>
{
    U key;
    V value;
    Pair(U k,V v)
    {
        this.key=k;
        this.value=v;
    }
    public U getKey()
    {
        return key;
    }
    public V getValue()
    {
        return value;
    }

}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> hs=new HashSet<String>();
        for(String s:wordList)
        hs.add(s);
        if(!hs.contains(endWord))return 0;
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        q.offer(new Pair(beginWord,1));
        hs.remove(beginWord);
         
        while(!q.isEmpty())
        {
            Pair<String,Integer> p=q.poll();
            int step=p.getValue();
            String s=p.getKey();
            if(s.equals(endWord)) return step;
            char[] ch=s.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
                char orig=ch[i];
                for(char cc='a';cc<='z';cc++)
                {
                    
                    ch[i]=cc;
                    String newString=new String(ch);
                    if(hs.contains(newString))
                    {
                        
                        hs.remove(newString);
                        q.offer(new Pair<>(newString,step+1));
                        
                    }
                }
                ch[i]=orig;

            }
        }
        return 0;
        
    }
}