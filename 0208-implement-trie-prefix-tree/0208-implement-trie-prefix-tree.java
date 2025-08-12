class Node
{
    Node [] children;
    boolean eow;
    Node()
    {
        children=new Node[26];
        eow=false;
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
            int idx_of_char=word.charAt(i)-'a';
            if(curr.children[idx_of_char]==null)
                curr.children[idx_of_char] =new Node();
            if(i==word.length()-1) curr.children[idx_of_char].eow=true;
            curr=curr.children[idx_of_char];

        }
        
    }
    
    public boolean search(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx_of_char=word.charAt(i)-'a';
            if(curr.children[idx_of_char]==null)
               return false;
             if(i==word.length()-1 && curr.children[idx_of_char].eow!=true) return false;
            curr=curr.children[idx_of_char];
        }
        return true;
        
    }
    
    public boolean startsWith(String prefix) {
        Node curr=root;
        for(int i=0;i<prefix.length();i++)
        {
            int idx_of_char=prefix.charAt(i)-'a';
            if(curr.children[idx_of_char]==null)
               return false;
            curr=curr.children[idx_of_char];
        }
        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */