class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int n:piles)
        {
            max=Math.max(n,max);
        }
        int l=1,r=max,k=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int ttl=0;
            for(int a:piles)
            {
                ttl=(int)(ttl+Math.ceil((double)a/mid));
            }
            if(ttl>h)
            {
                l=mid+1;
            }
            else if(ttl<=h)
            {
                k=mid;
                r=mid-1;
            }
        }
        return k;
        
    }
}