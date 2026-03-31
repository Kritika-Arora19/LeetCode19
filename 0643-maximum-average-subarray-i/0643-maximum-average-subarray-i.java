class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double c=0.0;
        for(int i=0;i<k;i++){
        c+=nums[i];}
        double max=c/k;
        for(int i=1;i<=nums.length-k;i++)
        {
            c=c+nums[i+k-1]-nums[i-1];
            max=Math.max(c/k,max);
        }
        return max;
    }
}