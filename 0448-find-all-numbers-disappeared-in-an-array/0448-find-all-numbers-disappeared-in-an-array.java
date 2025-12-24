class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=Math.abs(nums[i]);
            int nI=num-1;
            if(nums[nI]>0)
            {
                nums[nI]=nums[nI]*-1;
            }
        }
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]>=0)
            {
                al.add(i+1);
            }
         }
         return al;


        
    }
}