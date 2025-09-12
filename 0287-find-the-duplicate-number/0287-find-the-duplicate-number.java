class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     int num=nums[i];
        //     if(num<0)num=num*-1;
        //     if(nums[num-1]<0) return num;
        //     nums[num-1]=nums[num-1]*-1;
        // }
        // return 0;

        int slow=nums[0],fast=nums[0];
        do
        {
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);

        slow=nums[0];
        while(slow!=fast)
        {
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}