class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int l=0,r=height.length-1;
        while(l<r)
        {
            int ht=Math.min(height[l],height[r]);
            int wd=r-l;
            int area=ht*wd;
            max=Math.max(max,area);
            if(height[l]>height[r]) r--;
            else l++;
        }
        return max;
        
    }
}