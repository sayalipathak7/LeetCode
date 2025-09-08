class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> res=new HashSet<>();
        int start=0;
        List<Integer> op=new ArrayList<>();
        combinationSum(start,target,candidates,op,res);
        return new ArrayList<>(res);
        
    }
    public void combinationSum(int start,int target,int[] nums,List<Integer> op,Set<List<Integer>> res)
    {
        if(start==nums.length || target<0) return;
        if(target==0)
        {
            List<Integer> t=new ArrayList<>(op);
            Collections.sort(t);
            res.add(t);
            return;
        }

        op.add(nums[start]);
        combinationSum(start+1,target-nums[start],nums,op,res);
        combinationSum(start,target-nums[start],nums,op,res);
        op.remove(op.size()-1);
        combinationSum(start+1,target,nums,op,res);


    }
}