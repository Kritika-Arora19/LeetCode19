class Solution {
    public int maximumWealth(int[][] accounts) {
         int m = accounts.length;
        int n = accounts[0].length;
        int sum =0;
        int maxsum =0;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=accounts[i][j];
            }
            if(sum>=maxsum) maxsum = sum;
        }
        return maxsum;
    }
}