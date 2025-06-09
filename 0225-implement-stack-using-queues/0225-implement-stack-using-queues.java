class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
         q1= new LinkedList<Integer>();
         q2= new LinkedList<Integer>();

    }
    
    public void push(int x) {
        if(empty())
        {
            q1.offer(x);
        }
        else
        {
            while(!q1.isEmpty())q2.offer(q1.poll());
            q1.offer(x);
            while(!q2.isEmpty())q1.offer(q2.poll());
        }  
    }
    
    public int pop() {
        if(!empty())
        return q1.poll();
        else
         return -1;
    }
    
    public int top() {
        if(!empty())
        return q1.peek();
        else return -1;
    }
    
    public boolean empty() {
        if(q1.isEmpty())return true;
        return false;
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */