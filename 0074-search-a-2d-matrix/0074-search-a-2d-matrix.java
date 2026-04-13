class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int column=m-1;
          int row=0;
          
        while(row<n && column>=0){
            if(matrix[row][column]>target){
                 column--;
            }
            else if(matrix[row][column]<target){
                row++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}