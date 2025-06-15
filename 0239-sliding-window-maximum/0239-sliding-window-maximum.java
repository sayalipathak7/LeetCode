class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int [] res=new int[nums.length-k+1];
        Deque<Integer> d=new ArrayDeque<>();
        int l=0,r=0;
        while(r<nums.length)
        {
            while(!d.isEmpty() && d.peekLast()<nums[r])
            {
                d.pollLast();
            }
            d.offerLast(nums[r]);
            if(r-l+1<k)r++;
            else if(r-l+1==k)
            {
                res[l]=d.peekFirst();
                if(nums[l]==d.peekFirst()) d.pollFirst();
                l++;
                r++;
            }
        }
        return res;
    }
}