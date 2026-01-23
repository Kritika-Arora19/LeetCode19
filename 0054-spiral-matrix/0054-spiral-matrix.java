class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }
            for(int j=top+1;j<=bottom;j++)
            {
                list.add(matrix[j][right]);
            }
            if(top!=bottom){
             for(int k=right-1;k>=left;k--)
            {
                list.add(matrix[bottom][k]);
            }}
            if(left!=right){
             for(int s=bottom-1;s>top;s--)
            {
                list.add(matrix[s][left]);
            }}
            top++;left++;right--;bottom--;
        }
        return list;
    }
}