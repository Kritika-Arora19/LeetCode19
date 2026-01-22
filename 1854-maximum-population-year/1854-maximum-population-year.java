class Solution {
    public int maximumPopulation(int[][] logs) {
        int n = logs.length;
        int ans = 0;
        int max=0; 
        for (int i = 0; i < n; i++) {
            int year = logs[i][0];
            int count = 0; 
            for (int j = 0; j < n; j++) {
                if (logs[j][0] <= year && year < logs[j][1]) {
                    count++;
                }
            } 
            if (count > max || (count == max && year < ans)) {
                max = count;
                ans = year;
            }
        }
        return ans;
    }
}