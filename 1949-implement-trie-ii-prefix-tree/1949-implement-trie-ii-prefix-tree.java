class Node
{
    Node[] children;
    int preCounter;
    int endCounter;
    boolean eow;
    Node()
    {
        children=new Node[26];
        preCounter=0;
        endCounter=0;
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
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr.children[idx].preCounter++;
            if(i==word.length()-1) { 
                curr.children[idx].eow=true;
                curr.children[idx].endCounter++;
            }
            curr = curr.children[idx];


        }
        
    }
    
    public int countWordsEqualTo(String word) {
        
         Node curr=root;
         for(int i=0;i<word.length();i++)
         {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)return 0;
            if(i==word.length()-1 && curr.children[idx].eow==true) return curr.children[idx].endCounter;
            curr = curr.children[idx];
         }
         return 0;
    }
    
    public int countWordsStartingWith(String prefix) {
        Node curr=root;
        for(int i=0;i<prefix.length();i++)
        {
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null)return 0;
            if(i==prefix.length()-1) return curr.children[idx].preCounter;
            curr = curr.children[idx];
        }
        return 0;
        
    }
    
    public void erase(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
             int idx=word.charAt(i)-'a';
             if(curr.children[idx]==null)return;
             curr.children[idx].preCounter --;
             if(i==word.length()-1 && curr.children[idx].eow==true) curr.children[idx].endCounter--;

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