class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ls=0,rs=0,max=0;
        for(int i=0;i<=k-1;i++){
            ls=ls+cardPoints[i];
            max=ls;
        }
        int r=cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            ls=ls-cardPoints[i];
            rs=rs+cardPoints[r];
            r=r-1;
            max=Math.max(max,ls+rs);
        }
        return max;
    }
}