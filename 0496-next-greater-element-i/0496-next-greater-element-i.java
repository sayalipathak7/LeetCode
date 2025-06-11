class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int[] res=new int[nums1.length];
        Arrays.fill(res,-1);
        
        for(int i=0;i<nums2.length;i++)
        {
            int curr=nums2[i];
            while(!s.isEmpty() && curr > nums2[s.peek()])
            {
                int idx=s.pop();
                hm.put(nums2[idx],nums2[i]);
            }
            s.push(i);
        }
        for(int i=0;i<nums1.length;i++)
        {
            if(hm.containsKey(nums1[i]))
            {
                res[i]=hm.get(nums1[i]);
            }


        }
        
    
    return res;
        
        
    }
}