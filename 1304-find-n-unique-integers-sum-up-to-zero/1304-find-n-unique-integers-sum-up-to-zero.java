class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        if(n%2==0)
        {
            int k=1;
            for(int i=0;i<n/2;i++)
            {
                a[i]=(i+1)*-1;
            }
            for(int j=n/2;j<n;j++)
            {
                a[j]=k*1;
                k=k+1;
            }
        }
        else
        {
            int k=0;
            for(int i=0;i<n/2;i++)
            {
                a[i]=(i+1)*-1;
            }
            for(int j=n/2;j<n;j++)
            {
                a[j]=k*1;
                k=k+1;
            }
        }
        return a;
    }
}