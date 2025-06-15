class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0,sum=0;
        double max=Double.NEGATIVE_INFINITY;
        while(r<nums.length)
        {
            sum=sum+nums[r];
            if(r-l+1<k)r++;
            else if(r-l+1==k)
            {
                max=Math.max(sum,max);
                sum=sum-nums[l];
                l++;
                r++;
            }
        }
        return max/k;
        
    }
}