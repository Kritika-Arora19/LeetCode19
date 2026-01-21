class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] newm= new int[c][r];
        int c1=r;
        int r1=c;
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                newm[i][j]=matrix[j][i];
            }
        }
        return newm;
    }
}