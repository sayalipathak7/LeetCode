class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0 && nums[i]==nums[i-1]) continue;
            l=i+1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0) 
                {
                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(sum>0)  r--;
                else l++;
            }
           

        }
        return res;

        
    }
}