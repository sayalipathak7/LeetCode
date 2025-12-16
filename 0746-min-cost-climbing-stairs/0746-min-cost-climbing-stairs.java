class Solution {
    public int minCostClimbingStairs(int[] cost) {
        //bottom up tabulation tc - n sc- n
        // int[] mincost=new int[cost.length+1];
        // mincost[0]=0;
        // mincost[1]=0;
        // for(int i=2;i<=cost.length;i++)
        // {
        //     mincost[i]=Math.min(cost[i-1]+mincost[i-1],cost[i-2]+mincost[i-2]);
        // }
        // return mincost[cost.length];
//=============================================================================================================================
        //bottom up constant tc - n sc- 1
        // int p=0,pp=0,res=0;
        // for(int i=2;i<=cost.length;i++)
        // {
        //     res=Math.min(p+cost[i-1],pp+cost[i-2]);
        //     pp=p;
        //     p=res;
        // }
        // return res;
//=============================================================================================================================
        // top down memoizaion
        HashMap<Integer,Integer> min=new HashMap<>();
        return minCostClimbingStairs(cost.length,min,cost);
        
    }
    public int minCostClimbingStairs(int n,HashMap<Integer,Integer> hm,int[] cost) {
        if(n==0 || n==1) return 0;
        if(hm.containsKey(n))return hm.get(n);
         hm.put(n,Math.min(minCostClimbingStairs(n-1,hm,cost)+cost[n-1],minCostClimbingStairs(n-2,hm,cost)+cost[n-2]));
         return hm.get(n);

    }
}