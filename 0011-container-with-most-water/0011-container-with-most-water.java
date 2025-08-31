class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,max=0;
        while(l<r)
        {
            int width=r-l;
            int ht=Math.min(height[l],height[r]);
            int area=width*ht;
            max=Math.max(max,area);
            if(height[l]<height[r])l++;
            else r--;
        }
        return max;
        
    }
}