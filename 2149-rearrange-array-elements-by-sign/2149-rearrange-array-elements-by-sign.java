class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []p = new int[nums.length/2];
        int []n = new int[nums.length/2];
        int []ans = new int[nums.length];
        int k=0,j=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>0)
        p[k++]=nums[i];
        else
        n[j++]=nums[i];
       }
       k=0;
       for(int i=0;i<nums.length;i++)
       {
        if(i%2==0)
        ans[i]=p[k];
        else{
            ans[i]=n[k++];
        }
       }
       return ans; 
    }
}