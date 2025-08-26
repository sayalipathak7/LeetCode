class Solution {
    public int trap(int[] height) {
        int[] prefix_ht=new int[height.length];
        int[] sufix_ht=new int[height.length];
        prefix_ht[0]=0;
        sufix_ht[height.length-1]=0;
        int ttl=0;
        for(int i=1;i<height.length;i++)
        {
            prefix_ht[i]=Math.max(height[i-1],prefix_ht[i-1]);
        }
        for(int i=height.length-2;i>=0;i--)
        {
            sufix_ht[i]=Math.max(height[i+1],sufix_ht[i+1]);
        }
        for(int i=0;i<height.length;i++)
        {
            int water_trap=Math.min(prefix_ht[i],sufix_ht[i])-height[i];
            if(water_trap>0)
            {
                ttl=ttl+water_trap;

            }
        }
        return ttl;

        
    }
}