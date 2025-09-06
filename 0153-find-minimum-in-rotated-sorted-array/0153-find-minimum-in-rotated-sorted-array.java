class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            //check if left side is sorted
            if(nums[l]<=nums[mid])
            {
                min=Math.min(nums[l],min);
                //go to right
                l=mid+1;
            }
            else
            {
                min=Math.min(nums[mid],min);
                // got to left
                r=mid-1;
            }
        }
        return min;
        
    }
}