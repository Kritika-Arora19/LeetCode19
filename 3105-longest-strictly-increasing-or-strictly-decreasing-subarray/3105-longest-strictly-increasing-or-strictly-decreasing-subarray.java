class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int li=1,ld=1,s=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
            li++;
            ld=1;}
            else if(nums[i]<nums[i-1]){
            ld++;
            li=1;}
            else{
                li=1;
                ld=1;
            }
            s=Math.max(s,Math.max(li,ld));
        }
        return s;
    }
}