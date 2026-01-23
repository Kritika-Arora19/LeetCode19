class Solution {
    public int[][] generateMatrix(int n) {
           int top=0,left=0,m=1;
        int bottom=n-1;
        int right=n-1;
        int[][] ar=new int[n][n];
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                ar[top][i]=m++;
            }
            for(int j=top+1;j<=bottom;j++)
            {
                ar[j][right]=m++;
            }
            if(top!=bottom){
             for(int k=right-1;k>=left;k--)
            {
                ar[bottom][k]=m++;
            }}
            if(left!=right){
             for(int s=bottom-1;s>top;s--)
            {
                ar[s][left]=m++;
            }}
            top++;left++;right--;bottom--;
        }
        return ar;
    }
}