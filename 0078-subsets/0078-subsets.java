class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> num=new ArrayList<>();
        subset(0,num,nums,res);
        return res;

        
    }
    public void subset(int start, List<Integer> num,int[] nums,List<List<Integer>> res)
    {
        if(start==nums.length) 
        {
            res.add(new ArrayList<>(num));
            return ;
        }
        num.add(nums[start]);
        subset(start+1,num,nums,res);
        num.remove(num.size()-1);
        subset(start+1,num,nums,res);


    }
}