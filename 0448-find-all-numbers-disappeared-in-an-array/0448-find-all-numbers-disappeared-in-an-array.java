class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // ArrayList<Integer> al=new ArrayList<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     int num=Math.abs(nums[i]);
        //     int nI=num-1;
        //     if(nums[nI]>0)
        //     {
        //         nums[nI]=nums[nI]*-1;
        //     }
        // }
        //  for(int i=0;i<nums.length;i++)
        //  {
        //     if(nums[i]>=0)
        //     {
        //         al.add(i+1);
        //     }
        //  }
        //  return al;

 ArrayList<Integer> al=new ArrayList<>();
 HashSet<Integer> h=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
           h.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++)
         {
            if(!h.contains(i))
            {
                al.add(i);
            }
         }
         return al;


        
    }
}