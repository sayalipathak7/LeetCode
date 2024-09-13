class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0,max=0;
        for(int a:nums)
        {
            if(a==0)
            {
                cnt=0;
            }
            else
            {
                cnt++;
            }
            if(cnt>=max)
                max=cnt;
        }
        
            
        return max;
    }
}