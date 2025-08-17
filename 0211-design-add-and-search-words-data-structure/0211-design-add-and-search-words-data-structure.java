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

    public WordDictionary() {
        
    }
    Node root=new Node();
    
    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            if(i==word.length()-1)
            {
                curr.children[idx].eow=true;
            }

            curr=curr.children[idx];
        }
        
    }
    
    public boolean search(String word) {
        Node curr=root;
        return searchHelper(0,word,curr);
    }
    public boolean searchHelper(int i,String word,Node curr)
    {
        if(i==word.length())return curr.eow;
        if(word.charAt(i)=='.')
        {
            
            for(int idx=0;idx<26;idx++)
            {
                if(curr.children[idx]!=null)
                if(searchHelper(i+1,word,curr.children[idx]))return true;
            }
            return false;

        }
        else
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)return false;
            if(i==word.length()-1 && curr.children[idx].eow==false)return false;
            return searchHelper(i+1,word,curr.children[idx]);
        }

    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */