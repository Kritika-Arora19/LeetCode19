class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        int t=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                sum=sum+mat[i][j];
            }
        }
        for(int k=0;k<n;k++)
        {
            t=t-1;
            if(k!=t)
            sum=sum+mat[k][t];
        }
        return sum;
    }
}