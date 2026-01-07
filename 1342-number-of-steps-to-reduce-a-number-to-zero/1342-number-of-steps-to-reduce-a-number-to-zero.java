class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        return re(num,c);
    }
      static int re(int num, int c)
      {
      if(num==0)
      {
        return c;
      }  
      if(num%2==0)
      {
      return re(num/2,c+1);
      }
      else
      {
        return re(num-1,c+1);
      }
    }
}