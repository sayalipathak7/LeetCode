class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> op=new ArrayList<>();
        subsets(0,nums,op,res);
        return res;

    }
    public void subsets(int start,int[] nums, List<Integer> op,List<List<Integer>> res)
    {
        if(start==nums.length)
        {
            res.add(new ArrayList<>(op));
            return;
        }
        op.add(nums[start]);
        subsets(start+1,nums,op,res);
        op.remove(op.size()-1);
        subsets(start+1,nums,op,res);



    }
}