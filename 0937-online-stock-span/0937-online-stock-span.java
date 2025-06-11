class StockSpanner {
    ArrayList<Integer> al=new ArrayList<>();
    Stack<Integer> st=new Stack<>();
    int idx=0,previousGreateIndex=0,res=0;
    
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        if(al.size()==0)
        {
            st.push(0);
            al.add(idx,price);
            idx++;
            return 1;
        }
        else
        {
            while(!st.isEmpty() && price >=al.get(st.peek()))
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                previousGreateIndex=-1;
            }
            else
            {
                previousGreateIndex=st.peek();
            }
            st.push(idx);
            al.add(idx,price);

        }
       
        res=idx-previousGreateIndex;
        idx++;
        return res;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */