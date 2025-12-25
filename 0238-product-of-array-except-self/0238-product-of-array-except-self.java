class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix=1;
        int sufix=1;
        int[] res=new int[nums.length];
        res[0]=prefix;
       
        for(int i=1;i<nums.length;i++)
        {
            prefix=nums[i-1]*prefix;
            res[i]=prefix;
        }
        for(int i=nums.length-2;i>=0;i--)
        {
            sufix=sufix*nums[i+1];
            res[i]=res[i]*sufix;
        }
        
        return res;
        
    }
}