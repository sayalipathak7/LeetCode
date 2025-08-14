class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                int j=hm.get(target-nums[i]);
                return new int[]{i,j};
            }
                
            hm.put(nums[i],i);
        }
        return new int[]{};
        
    }
}