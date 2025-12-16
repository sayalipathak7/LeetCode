class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //bottom up tabulation
        int[] mincost=new int[cost.length+1];
        mincost[0]=0;
        mincost[1]=0;
        for(int i=2;i<=cost.length;i++)
        {
            mincost[i]=Math.min(cost[i-1]+mincost[i-1],cost[i-2]+mincost[i-2]);
        }
        return mincost[cost.length];


        
    }
}