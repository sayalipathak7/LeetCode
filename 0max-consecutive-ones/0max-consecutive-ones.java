class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                cnt=0;
            }
            else
            {
                System.out.println(cnt);
                cnt++;
                if(cnt>=max)
                {
                    max=cnt;
                }
                
            }
          
        }
        return max;
        
    }
}