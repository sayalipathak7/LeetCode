class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            int target=nums[i];
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
                if(target+nums[l]+nums[r]==0)
                {
                    res.add(Arrays.asList(target,nums[l],nums[r]));
                    l++;r--;
                }
                if(nums[l]+nums[r]+target <0) l++;
                else if(nums[l]+nums[r]+target >0) r--;

            }
        }
        List<List<Integer>> list = new ArrayList<>(res);
        return list;
        
    }
}