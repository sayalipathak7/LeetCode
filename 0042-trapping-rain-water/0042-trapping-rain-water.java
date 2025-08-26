class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lm=0,rm=0;
        int ans=0;
        while(l<r)
        {
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            if(lm<rm)
            {
                ans=ans+lm-height[l];
                l++;

            }
            else
            {
                ans=ans+rm-height[r];
                r--;
            }

        }
        return ans;
    }
}