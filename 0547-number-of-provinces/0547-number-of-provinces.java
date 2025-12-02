class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int[] par=new int[n];
        int[] size=new int[n];
        for(int i=0;i<n;i++)
        {
            par[i]=i;
        }
        for(int i=0;i<n;i++)
        {
            size[i]=1;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<isConnected[0].length;j++)
            {
                if(isConnected[i][j]==1)
                {
                    unionfind(i,j,par,size);
                }
            }
        }
       int cnt=0;
        for(int i=0;i<n;i++)
        {
           if(i==par[i])
           cnt++;
        }
        return cnt;
        
    }
    public void unionfind(int u,int v,int[] par,int[] size)
    {
        int ulU=ulParent(u,par);
        int ulV=ulParent(v,par);
        if(ulU==ulV)return;
        int ulUSize=size[ulU];
        int ulVSize=size[ulV];
        if(ulUSize<ulVSize)
        {
            par[ulU]=ulV;
            size[ulV]=size[ulV]+size[ulU];
        }
        else
        {
            par[ulV]=ulU;
            size[ulU]=size[ulU]+size[ulV];
        }

    }
    public int ulParent(int x,int[] par)
    {
        if(par[x]==x)return x;
        int p=ulParent(par[x],par);
        par[x]=p;
        return par[x];


    }
}