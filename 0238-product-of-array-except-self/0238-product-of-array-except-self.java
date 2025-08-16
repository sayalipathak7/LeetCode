class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int prefix=1;
        int sufix=1;
        
        int [] res=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++)
        {
            res[i]=prefix*nums[i-1];
            prefix=res[i];

        }
        for(int i=n-2;i>=0;i--)
        {
            sufix=sufix*nums[i+1];
            res[i]=res[i]*sufix;

        }
        
        return res;
        
    }
}