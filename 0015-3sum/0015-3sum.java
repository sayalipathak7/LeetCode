class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            List<Integer> al=new ArrayList<>();
            int target=nums[i];
            HashSet<Integer> h=new HashSet<>();
            for(int j=i+1;j<nums.length;j++)
            {
                if(h.contains((target+nums[j])*-1))
                {
                    res.add(Arrays.asList(target,nums[j],(target+nums[j])*-1));
                    

                }
                else
                 h.add(nums[j]);
            }
           

        }
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
        
    }
}