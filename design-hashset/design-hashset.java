class MyHashSet {
    int set_len=100000;
    ArrayList[] set=new ArrayList[set_len];
    
    public int hashing(int key)
    {
        return key%set_len;
    }
     
    public int getposinal(ArrayList al,int key)
    {
           for(int i=0;i<al.size();i++)
           {
               return i;
           }
        return -1;
    }
     
        

    public MyHashSet() {
       
        
    }
    
    public void add(int key) {
        int index=hashing(key);
        if(!contains(key) && set[index]!=null)
        {
            System.out.println("adding the element" + key);
            set[index].add(key);
        }
        else if(!contains(key))
        {
            System.out.println("adding the element and new al" + key);
            ArrayList<Integer> al=new ArrayList<>();
            set[index]=al;
            set[index].add(key);
        }
        else
            
            System.out.println("alredy present"+key);
    }
    
    public void remove(int key) {
        int index=hashing(key);
        if(contains(key))
        {
            int i=getposinal(set[index],key);
            if(i>=0)
                set[index].remove(i);
        }
        
        
    }
    
    public boolean contains(int key) {
       int index=hashing(key);
        if(set[index]!=null && set[index].contains(key))
        {
             System.out.println("element is there"+key);
            return true;
        }
            
        else
        {
            System.out.println("element is not there"+key);
            return false;
        }
            
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */