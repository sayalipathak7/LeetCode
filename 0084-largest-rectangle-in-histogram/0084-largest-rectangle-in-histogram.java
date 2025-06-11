class Solution {
    public int largestRectangleArea(int[] heights) {
        int max=0,area=0,afterweidth=0,Beforeweidth=0;
        int [] prevSmaller=new int[heights.length];
        int [] nextSmaller=new int[heights.length];
        Arrays.fill(nextSmaller, heights.length);
        Arrays.fill(prevSmaller, -1);
        Stack<Integer> s=new Stack<>();
        
        // for(int i=0;i<heights.length;i++)
        // {
        //     //prev smaller
        //     int j=i;
        //     Beforeweidth=0;
        //     while(j>=0 && heights[j]>=heights[i])
        //     {
        //         Beforeweidth=i-j+1;
        //         j--;

        //     }
        //    // System.out.println(Beforeweidth + " Beforeweidth for : " + heights[i] );
        //     // next smaller
        //     int k=i+1;
        //     afterweidth=0;
        //     while(k<heights.length && heights[k]>=heights[i])
        //     {
        //         afterweidth=k-i;
        //         k++;

        //     }
        //     //System.out.println(afterweidth + "afterweidth for : " + heights[i] );
        //     area=heights[i]*(Beforeweidth+afterweidth);
        //     //System.out.println(area  + " area for : " + heights[i] );
        //     max=Math.max(area,max);
        // }
        // return max;

        for(int i=0;i<heights.length;i++)
        {
            //find next smaller - increasing monotonic stack
            int curr=heights[i];
            while(!s.isEmpty() && curr<heights[s.peek()])
            {
                int idx=s.pop();
                nextSmaller[idx]=i;

            }
            s.push(i);
        }
       
        s.clear();
        prevSmaller[0]=-1;
        s.push(0);
        
        for(int i=1;i<heights.length;i++)
        {
            while(!s.isEmpty() && heights[i]<heights[s.peek()])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                 prevSmaller[i]=-1;
            }
            else
            {
                 prevSmaller[i]=s.peek();
            }
            s.push(i);

        }
         //System.out.println(Arrays.toString(prevSmaller));
        for(int i=0;i<heights.length;i++)
        {
            area=(nextSmaller[i]-prevSmaller[i]-1)*heights[i];
            max=Math.max(area,max);
        }
        return max;
        
    }
}