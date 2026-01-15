class Solution {
    public int[] shuffle(int[] nums, int n) {
        int k=0,i=0,j=n;
        int[] ans=new int[n*2];
        while(i<n && j<n*2)
        {
            ans[k]=nums[i];
            ans[k+1]=nums[j];
            j++;
            i++;
            k=k+2;
        }
        return ans;
    }
}