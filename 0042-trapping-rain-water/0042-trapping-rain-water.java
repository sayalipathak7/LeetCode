class Solution {
    public int trap(int[] height) {

        int left_max=0;
        int right_max=0;
        int l=0,r=height.length-1,ans=0;
        while(l<r)
        {
            left_max=Math.max(left_max,height[l]);
            right_max=Math.max(right_max,height[r]);
            if(left_max<right_max)
            {
                ans=ans+left_max-height[l];
                l++;
            }
            else
            {
                ans=ans+right_max-height[r];
                r--;
            }


        }
        return ans;
        // int [] prefix=new int[height.length];
        // int [] suffix=new int[height.length];
        // prefix[0]=0;
        // suffix[height.length-1]=0;
        // int ttl=0;
       

        // for(int i=1;i<height.length;i++)
        // {
        //     prefix[i]=Math.max(height[i-1],prefix[i-1]);
        // }
        // for(int i=height.length-2;i>=0;i--)
        // {
        //     suffix[i]=Math.max(height[i+1],suffix[i+1]);
        // }
        // for(int i=0;i<height.length;i++)
        // {
        //     int waterTrapped=Math.min(prefix[i],suffix[i])-height[i];
        //     if(waterTrapped>0)
        //     ttl=ttl+waterTrapped;

        // }
        // return ttl;


        
    }
}