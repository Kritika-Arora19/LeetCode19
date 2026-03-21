class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int im=k+x-1;
        int jm=k+y;
        for(int i=x;i<im;i++)
        {
            for(int j=y;j<jm;j++)
            {
                int temp=grid[i][j];
                grid[i][j]=grid[im][j];
                grid[im][j]=temp;
            }
            im--;
        }
        return grid;
    }
}