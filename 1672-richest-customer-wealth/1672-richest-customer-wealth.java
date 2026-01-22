class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        int sum=0,max=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum=sum+accounts[i][j];
            }
            if(sum>max)
            max=sum;
            sum=0;
        }
        return max;
    }
}