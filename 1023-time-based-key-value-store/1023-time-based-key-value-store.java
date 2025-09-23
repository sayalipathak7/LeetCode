class TimeMap {
    
    HashMap<String,ArrayList<Pair<Integer,String>>> hm=new HashMap<>();

    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        Pair<Integer,String> p=new Pair<>(timestamp,value);
        if(!hm.containsKey(key))
        {
            ArrayList<Pair<Integer,String>> q=new ArrayList<>();
            hm.put(key,q);
           
        }
        hm.get(key).add(p);
        
    }
    
    public String get(String key, int timestamp) {
         if(!hm.containsKey(key)) return "";
        
      
            ArrayList<Pair<Integer,String>>al=hm.get(key);
            int l=0,r=al.size()-1;
            String res="";
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                if(al.get(mid).getKey()<=timestamp) 
               
                {
                    res= al.get(mid).getValue();
                    l=mid+1;
                }
                else
                {
                    r=mid-1;
                }
            }
       
        return res;
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */