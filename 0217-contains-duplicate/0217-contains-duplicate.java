class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++)
       {
            int j=i-1;
            if(nums[i]==nums[j])return true;
       }
       return false;
    }
}