class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> h=new HashSet<>();
        for(int n:nums)
        {
            if(!h.add(n))
            return true;

        }
        return false;
    }
}