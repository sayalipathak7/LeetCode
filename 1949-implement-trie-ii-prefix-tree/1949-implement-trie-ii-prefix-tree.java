class Node
{
    Node[] children;
    boolean eow;
    int countPref;
    int contEnd;
    Node()
    {
        children=new Node[26];
        eow=false;
        countPref=0;
        contEnd=0;
    }
}
class Trie {
    Node root=new Node();

    public Trie() {
        
    }
    
    public void insert(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr.children[idx].countPref=curr.children[idx].countPref+1;
            if(i==word.length()-1)
            {
                curr.children[idx].eow=true;
                curr.children[idx].contEnd=curr.children[idx].contEnd+1;
            }
            curr=curr.children[idx];
    
        }

        
    }
    
    public int countWordsEqualTo(String word) {
        int count=0;
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
             int idx=word.charAt(i)-'a';
             if(curr.children[idx]==null)
             {
                return 0;
             }
             if(i==word.length()-1)
             {
                if(curr.children[idx].eow!=true) return 0;;
                count= curr.children[idx].contEnd;
             }
             curr=curr.children[idx];
        }


        return count;
        
    }
    
    public int countWordsStartingWith(String prefix) {

        int count=0;
        Node curr=root;
        for(int i=0;i<prefix.length();i++)
        {
             int idx=prefix.charAt(i)-'a';
             if(curr.children[idx]==null)
             {
                return 0;
             }
             if(i==prefix.length()-1)
             {
                count= curr.children[idx].countPref;
             }
             curr=curr.children[idx];
        }


        return count;
        
    }
    
    public void erase(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
             int idx=word.charAt(i)-'a';
             if(curr.children[idx]==null)return;
             curr.children[idx].countPref=curr.children[idx].countPref-1;
                if(i == word.length() - 1) {
            if(curr.children[idx].eow) {
                curr.children[idx].contEnd--;
                if(curr.children[idx].contEnd == 0) curr.children[idx].eow = false;
            }
        }
        
        curr = curr.children[idx];
    }
}
            
        
        
    
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * int param_2 = obj.countWordsEqualTo(word);
 * int param_3 = obj.countWordsStartingWith(prefix);
 * obj.erase(word);
 */