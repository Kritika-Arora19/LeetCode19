class Solution {
    public int smallestNumber(int n, int t) {
        int m=n,c=0;
        while(c<=10)
        {
            c++;
            n=m;
            int p=1;
          while(n>0)
          {
            int r=n%10;
            p=p*r;
            n=n/10;
          }
          if(p%t==0)
          return m;
          else
          m++;
        }
    return 0;
    }    
}