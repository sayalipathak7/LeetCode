class Solution {
    public int trap(int[] height) {
        int[] p=new int[height.length];
        int[] s=new int[height.length];
        p[0]=0;
        s[height.length-1]=0;
        for(int i=1;i<height.length;i++)
        {
            p[i]=Math.max(p[i-1],height[i-1]);
        }
        for(int i=height.length-2;i>=0;i--)
        {
            s[i]=Math.max(s[i+1],height[i+1]);
        }
        int cnt=0;
        for(int i=0;i<height.length;i++)
        {
            int ttl=Math.min(p[i],s[i])-height[i];
            if(ttl>0)
            cnt=ttl+cnt;

        }
        return cnt;
        
    }
}