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
class WordDictionary {
    Node root=new Node();

    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null) curr.children[idx]=new Node();
            if(i==word.length()-1) curr.children[idx].eow=true;
            curr=curr.children[idx];
        }
        
    }
    
    public boolean search(String word) {
        Node curr=root;
        return searchHelper(curr,word,0);   
        
    }
    public boolean searchHelper(Node curr,String word,int i)
    {
        if(i==word.length()) return curr.eow;
        if(word.charAt(i)=='.')
        {
            for(int j=0;j<26;j++)
            {
                if(curr.children[j]!=null)
                {
                    if(searchHelper(curr.children[j],word,i+1)==true) return true;
                }
            }
            return false;

        }
        else
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)return false;
            if(i==word.length()-1 && curr.children[idx].eow!=true) return false;
            return searchHelper(curr.children[idx],word,i+1);

        }

    }     
       
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */