class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    private int helper(int[] nums,int k){
        if(k<0) return 0;
        int n=nums.length;
        int[] freq=new int[n+1];
        int distinct=0;
        int ans=0;
        for(int i=0,j=0;i<n;i++){
            if(freq[nums[i]]++==0) distinct++;
            while(distinct>k){
                if(--freq[nums[j]]==0) distinct--;
                j++;
            }
            ans+=(i-j+1);
        }

        return ans;
    }
}