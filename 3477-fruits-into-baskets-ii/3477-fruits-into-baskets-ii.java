class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int l=0,r=0,s=-1,m=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(fruits[i]<=baskets[j]){
                    m--;
                    baskets[j]=-1;
                    break;
                }
            }
        }
        return m;
    }
}