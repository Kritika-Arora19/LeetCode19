class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int left=k-1;
        int right=n-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int maxsum=sum;
        while(left>=0){
            sum-=cardPoints[left];
            sum+=cardPoints[right];
            left--;
            right--;
            maxsum=Math.max(maxsum,sum);
        }
    return maxsum;
    }
}