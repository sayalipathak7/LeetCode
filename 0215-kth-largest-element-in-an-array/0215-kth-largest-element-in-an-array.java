class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int n:nums)
        {
            pq.offer(n);
        }
        int i=0,res=0;
        while(i<k) {
            res=pq.poll();
            i++;
        }
        return res;
        
    }
}