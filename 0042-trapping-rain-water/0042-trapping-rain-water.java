class Solution {
    public int trap(int[] height) {
        int [] p=new int[height.length];
        int [] s=new int[height.length];
        p[0]=0;
        s[height.length-1]=0;
        int total=0;
        for(int i=1;i<height.length;i++)
        {
            p[i]=Math.max(height[i-1],p[i-1]);

        }
        for(int i=height.length-2;i>=0;i--)
        {
            s[i]=Math.max(height[i+1],s[i+1]);
        }
        for(int i=0;i<height.length;i++)
        {
            if(Math.min(p[i],s[i])-height[i]>0)
            {
                total=total+Math.min(p[i],s[i])-height[i];
            }

        }
        return total;
        
    }
}