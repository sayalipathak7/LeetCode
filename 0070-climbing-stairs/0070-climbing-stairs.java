class Solution {
    public int climbStairs(int n) {
        int prev2=1,prev=2;
        if(n<=2) return n;
        int rn=0;
        for(int i=3;i<=n;i++)
        {
            rn=prev+prev2;
            prev2=prev;
            prev=rn;
        }
        return rn;
    }
}