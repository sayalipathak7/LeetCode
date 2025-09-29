class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> op=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        subsets(0,nums, op,res);
        return res;
    }
    public void subsets(int idx,int[] nums, ArrayList<Integer> op,List<List<Integer>> res)
    {
        if(idx==nums.length)
        {
            res.add(new ArrayList<>(op));
            return;
        }
        //insclude
        op.add(nums[idx]);
        subsets(idx+1,nums,op,res);
        //exclude
        op.remove(op.size()-1);
        subsets(idx+1,nums,op,res);

    }
}