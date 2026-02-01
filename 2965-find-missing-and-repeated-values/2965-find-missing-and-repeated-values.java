class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int a=0,b=0,k=0;
        int[] f=new int[2];
        int[] ans = new int[n*n];
        for(int s=0;s<ans.length;s++)
        {
            ans[s]=0;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                k=grid[i][j];
                ans[k-1]++;
            }
        }
        for(int l=0;l<ans.length;l++)
        {
            if(ans[l]==0)
            b=l+1;
            else if(ans[l]==2)
            a=l+1;
        }
        f[0]=a;
        f[1]=b;
        return f;
    }
}