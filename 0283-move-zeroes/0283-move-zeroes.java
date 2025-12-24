class Solution {
    public void moveZeroes(int[] nums) {
        int l=0,r=1;
        
        if(nums.length==0 || nums.length==1)return;
        while(r<nums.length)
        {
            if(nums[l]!=0)l++;
            if(nums[l]==0 && nums[r]!=0)
            {
                nums[l]=nums[r];
                nums[r]=0;
                l++;
            }
            r++;
        }
    }
}