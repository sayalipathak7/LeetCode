class TimeMap {
    HashMap<String,ArrayList<Pair<String,Integer>>> hm;

    public TimeMap() {
        hm=new HashMap<>();
        
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key))
        {
            hm.put(key,new ArrayList<Pair<String,Integer>>());
        }
        Pair<String,Integer> p=new Pair<>(value,timestamp);
        hm.get(key).add(p);
        
    }
    
    public String get(String key, int timestamp) {
        if(hm.containsKey(key))
        {
            ArrayList<Pair<String,Integer>> al=hm.get(key);
            int l=0, r=al.size()-1;
            String val="";
            int t=0;
            while(l<=r)
            {
                int mid=l+(r-l)/2;
                Pair<String,Integer> p1=al.get(mid);
                int tp=p1.getValue();
                
                if(tp<=timestamp) 
                {
                    if(tp>t)
                    {
                        t=tp;
                        val=p1.getKey();;
                    } 
                    l=mid+1;
                } 
                else
                {
                    r=mid-1;
                }

            }
            return val;

        }
        else return "";
        
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */