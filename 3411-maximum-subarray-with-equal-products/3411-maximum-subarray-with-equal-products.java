class Solution {
    public int maxLength(int[] nums) {
        int primes[]= {2,3,5,7};
        int last[] = {-1,-1,-1,-1};
        int best=2,left=0;
        for(int r=0;r<nums.length;r++){
            for(int k=0;k<4;k++){
                if(nums[r]%primes[k]==0){
                    left=Math.max(left,last[k]+1);
                    last[k]=r;
                }
            }
            best=Math.max(best,r-left+1);
        }
        return best;
    }
}