class Solution {
    public int maximumPopulation(int[][] logs) {
        int po=0,max=0;
        for(int i=0;i<logs.length;i++)
        {
            int c=0;
            for(int j=0;j<logs.length;j++)
            {
                if((logs[j][0]<=logs[i][0] && logs[i][0]<logs[j][1]) && logs[j][0]<=logs[i][1] && logs[i][0]<logs[j][1])
                c=c+1;
            }
            if(c>max){
                max=c;
                po=logs[i][0];
            }
            if(c==max && po>logs[i][0]){
                max=c;
                po=logs[i][0];
            }
        }
        return po;
    }
}