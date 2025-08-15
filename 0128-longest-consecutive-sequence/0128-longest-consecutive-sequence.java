class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h=new HashSet<>();
        int cnt=0;
        int max=0;
        for(int a:nums)
        {
            h.add(a);
        }
        for(int a:h)
        {
            cnt=0;
            if(!h.contains(a+1))
            {
                int b=a;
                while(h.contains(b))
                {
                    cnt++;
                    b=b-1;
                }
            max=Math.max(cnt,max);

            }
               
            
        }
        return max;
        
    }
}