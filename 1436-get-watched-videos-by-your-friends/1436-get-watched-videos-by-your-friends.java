class Solution {
    public List<String> watchedVideosByFriends(List<List<String>> watchedVideos, int[][] friends, int id, int level) {
        Queue<int[]> q=new LinkedList<>();
        boolean[] v=new boolean[friends.length];
        HashMap<String,Integer> hm=new HashMap<>();
        
        q.offer(new int[]{id,0});
        v[id]=true;
        while(!q.isEmpty())
        {
            int[] a=q.poll();
            int p=a[0];
            int dist=a[1];
            if(a[1]<level)
            {
                for(int f : friends[p])
                {
                    if(!v[f])
                    {
                        q.offer(new int[]{f,dist+1});
                        v[f]=true;
                    }
                }

            }
            else
            {
                for(String video: watchedVideos.get(p))
                {
                   hm.put(video, hm.getOrDefault(video,0)+1);
                }

            }
        }
        //System.out.println(hm);
        ArrayList<String> res=new  ArrayList<String>(hm.keySet());
        Collections.sort(res,(a,b)->
        {
            int frqA=hm.get(a);
            int frqB=hm.get(b);
            if(frqA!=frqB)
            return frqA-frqB;
            return a.compareTo(b);

        });
        return res;

        
    }
}