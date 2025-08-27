class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int a:stones) pq.offer(a);
        while(pq.size()>1)
        {
            int y=pq.poll();
            int x=pq.poll();
            if(x!=y) pq.offer(y-x);
        }
        if(pq.size()==1) return pq.peek();
        else return 0;

        
    }
}