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

    Node root=new Node();
    public void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
                curr.children[idx]=new Node();
            if(i==word.length()-1) curr.children[idx].eow=true;
            curr=curr.children[idx];

        }
    }

    public String longestWord(String[] words) {
        for(String s:words)
        {
            insert(s);
        }
        
        String max_string="";
        for(String word:words)
        {
            Node curr=root;
            boolean allprefix=true;
            for(int i=0;i<word.length();i++)
            {
                int idx=word.charAt(i)-'a';
                if(curr.children[idx].eow!=true)
                {
                    allprefix=false;
                    break;
                } 
                
                curr=curr.children[idx];
            }
            if(allprefix)
            {
                if(word.length()>max_string.length())
                    max_string= word;
                if(!word.equals(max_string) && word.length()==max_string.length())
                    max_string= (word.compareTo(max_string)<0)? word : max_string;
            }
        }
        return max_string;
        
    }
}