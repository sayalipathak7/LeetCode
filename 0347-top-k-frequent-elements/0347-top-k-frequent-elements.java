class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> [] res=new ArrayList[nums.length+1];
        for(int i=0;i<res.length;i++)
        {
            res[i]=new ArrayList<Integer>();
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int a:nums)
        {
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(int ky:hm.keySet())
        {
            int cnt=hm.get(ky);
            res[cnt].add(ky);
        }
        int k1=0;
        int [] r=new int[k];
        for(int i=res.length-1;i>=0;i--)
        {
            ArrayList<Integer> al=res[i];
            for(int a:al)
            {
                if(k1<k)
                {
                    r[k1++]=a;

                }
                else
                {
                    break;
                }

            }
            


        }
        return r;


        
    }
}