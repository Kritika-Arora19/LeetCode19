class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x=nums1[nums1.length-1];
        int y=nums2[nums2.length-1];
        int []a=new int[Math.max(x+1,nums1.length)];
        int []b=new int[Math.max(y+1,nums2.length)];
        int m=Math.min(a.length,b.length);
        int j=0,s=0,s1=0,f=0;
        for(int i=0;i<nums1.length;i++)
        {
            a[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++)
        {
            b[nums2[i]]++;
        }
        for(int k=0;k<m;k++)
        {
            if(a[k]>=1 && b[k]>=1)
            {
                s=Math.min(a[k],b[k]);
                f=f+s;
            }
        }
        int []ans=new int[f];
        for(int k=0;k<m;k++)
        {
            if(a[k]>=1 && b[k]>=1)
            {
                s1=Math.min(a[k],b[k]);
                for(int n=0;n<s1;n++)
                {
                    ans[j]=k;
                    j++;
                }
            }
        }
        return ans;
    }
}