class Solution {
    public int trap(int[] height) {
 
        int total=0;
        int l=1,r=height.length-2;
        int lmax=height[0],rmax=height[height.length-1];
        while(l<=r)
        {
            if(lmax<=rmax)
            {
                if(lmax-height[l]>0)
                {
                    total=total+lmax-height[l];
                    
                }
                lmax=Math.max(lmax,height[l]);
                l++;
                
            }
            else
            {
                if(rmax-height[r]>0)
                {
                    total=total+rmax-height[r];
                    
                }
                rmax=Math.max(rmax,height[r]);
                r--;
                
            }

        }

        
        return total;
        
    }
}