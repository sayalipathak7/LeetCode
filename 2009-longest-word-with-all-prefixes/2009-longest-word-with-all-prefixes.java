class Node
{
    Node[] children;
    boolean eow;
    Node()
    {
        children=new Node[26];
        eow=false;
    }
}
class Solution {
    Node root=new Node();;
    public void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)curr.children[idx]=new Node();
            if(i==word.length()-1)curr.children[idx].eow=true;
            curr=curr.children[idx];
        }

    }
    public String longestWord(String[] words) {
        String max="";
        for(String word:words)
        {
            insert(word);
        }
        for(String word:words)
        {
            boolean allPrefixes=true;
            Node curr=root;
            for(int i=0;i<word.length();i++)
            {
                int idx=word.charAt(i)-'a';
                //System.out.println(word+" : " +word.charAt(i) +" : " +curr.children[idx]);
                if(curr.children[idx].eow==false)
                {
                    allPrefixes=false;
                    break;

                }
                curr= curr.children[idx];
            }
            if(allPrefixes)
            {
                if(word.length()>max.length())max=word;
                else if(word.length()==max.length())
                {
                    max=word.compareTo(max)<0? word :max;
                }

            }
            
        }
        return max;
        
    }
}