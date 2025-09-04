class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        return bs(nums,l,r,target);        
    }
    public int bs(int[] nums,int l,int r,int target)
    {
        if(r<l) return -1;
        int mid=l+(r-l)/2;
        if(nums[mid]==target)return mid;
        else if(nums[mid]<target)
         return bs(nums,mid+1,r,target);
        else return bs(nums,l,mid-1,target);


    }
}