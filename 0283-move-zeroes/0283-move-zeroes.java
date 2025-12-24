class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=1;
        while(r<nums.length)
        {
            if(nums[l]==0)
            {
                while(r<nums.length && nums[r]==0)r++;
                if(r<nums.length){
                    nums[l]=nums[r];
                    nums[r]=0;

                }
            }
            r++;
            l++;
        }
        
    }
}