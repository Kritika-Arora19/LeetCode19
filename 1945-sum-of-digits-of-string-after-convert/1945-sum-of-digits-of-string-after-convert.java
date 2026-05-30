class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(char c:s.toCharArray()){
            int v=(c-'a')+1;
            sum+=v/10;
            sum+=v%10;}
            k--;
        while(k>0)
        {
            int t=0;
            while(sum!=0)
            {
                int r=sum%10;
                t=t+r;
                sum=sum/10;
            }
            sum=t;
            k--;
        }
    return sum;
    }
}