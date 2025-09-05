class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int n:piles)
        {
            max=Math.max(max,n);
        }
        int l=1,r=max,k=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int ttlHr=0;
            for(int p:piles)
            {
                ttlHr=(int)(ttlHr+Math.ceil((double)p/mid));
            }
            if(ttlHr>h)
            {
                l=mid+1;
            }
            else if(ttlHr<=h)
            {
                k=mid;
                r=mid-1;
            } 
            
        }
        // for(int k=1;k<=max;k++)
        // {
        //     int ttlHr=0;
        //     for(int p:piles)
        //     {
        //         ttlHr=(int)(ttlHr+Math.ceil((double)p/k));
        //     }
        //     if(ttlHr<=h) return k;
        // }

        return k;
        
    }
}