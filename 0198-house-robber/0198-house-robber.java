class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int [] dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=nums[1];
        for(int i=2;i<nums.length;i++)
        {
            int j=i-2;
            while(j>=0)
            {
                if(dp[i]!=0)
                {
                    dp[i]=Math.max(dp[i],dp[j]+nums[i]);

                }
                else
                {
                    dp[i]=dp[j]+nums[i];
                }
                j=j-1;

            }
        }
        return Math.max(dp[nums.length-1],dp[nums.length-2]);
        
    }
}