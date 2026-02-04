class Solution {
    public int countNegatives(int[][] grid) {
        int rows=grid.length, cols=grid[0].length;
        int r = 0, c = cols-1;
        int answer = 0;
        while(r<rows && c>=0){
            if(grid[r][c]<0) { 
                answer += rows - r;
                c--;
            } else {
                r++;
            }
        }
        return answer;
    }
}