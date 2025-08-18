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
    int count=0;
    public int countDistinct(String s) {
        ArrayList<String> suffixList= new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            suffixList.add(s.substring(i,s.length()));
        }
        System.out.println(suffixList.toString());
        for(String word:suffixList) insert(word);
        return count;
        
    }
    public void insert(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
                count++;
            }
            if(i==word.length()-1)curr.children[idx].eow=true;
            curr=curr.children[idx];
        }

    }
}