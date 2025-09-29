class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        ArrayList<Integer> op = new ArrayList<>();
        for (int num : nums) {
            op.add(num);  // convert each int to Integer
        }
        permute(0,op,res);
        return res;
    }
    public void permute(int idx,ArrayList<Integer>op,List<List<Integer>> res)
    {
        if(idx==op.size()-1)
        {
            res.add(new ArrayList<Integer>(op));
            return;
        }
        HashSet<Integer> h=new HashSet<>();
        for(int i=idx;i<op.size();i++)
        {
            if(!h.contains(op.get(i)))
            {
                h.add(op.get(i));
                swap(op,i,idx);
                permute(idx+1,op,res);
                swap(op,idx,i);
            }
        }

    }
    public void swap(ArrayList<Integer>op,int idx1,int idx2)
    {
        int temp=op.get(idx1);
        op.set(idx1,op.get(idx2));
        op.set(idx2,temp);
    }
}