class Solution {
    public int maxProduct(int n) {
        int pro=0;
        List<Integer> list= new ArrayList<>();
        while(n>0)
        {
            int r=n%10;
            list.add(r);
            n=n/10;
        }
        Integer[] arr = list.toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int ans=arr[i]*arr[j];
                if(ans>pro)
                pro=ans;
            }
        }
        return pro;
    }
}