class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleetCnt=1;
        ArrayList<Pair<Integer,Double>> al=new ArrayList<>();
        double [] time=new double[position.length];
        for(int i=0;i<position.length;i++)
        {
            time[i]=(target-position[i])/(double)speed[i];
            Pair<Integer,Double> p=new Pair(position[i],time[i]);
            al.add(p);
        }
        Collections.sort(al,(a,b)->a.getKey()-b.getKey());
        int r=al.size()-1,l=al.size()-2;
        while(r>0 && l>=0)
        {
            if(al.get(l).getValue()<=al.get(r).getValue())
            {
                l--;
            }
            else
            {
                fleetCnt++;
                r=l;
                l--;
            }
        }
        return fleetCnt;

        
    }
}