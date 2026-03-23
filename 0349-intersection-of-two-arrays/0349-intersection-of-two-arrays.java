class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int []a=new int[1001];
        int s=0;
        for(int i=0;i<nums1.length;i++)
        {
            a[nums1[i]]=1;
        }
        for(int j=0;j<nums2.length;j++)
        {
            if(a[nums2[j]]==1)
            {
                s++;
                a[nums2[j]]=2;
            }
        }
        int res[]=new int[s];
        for(int i=0,j=0;i<1001;i++)
        {
            if(a[i]==2){
            res[j]=i;
            j++;}
        }
        return res;
    }
}