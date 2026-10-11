class Solution {
    public boolean judgeSquareSum(int c) {
        int n=(int)Math.sqrt(c);
        int s=0,e=n;
        while(s<=e){
            long ans=(long)s*s+(long)e*e;
            if(ans==c)
            return true;
            else if(ans>c)
            e--;
            else
            s++;
            }
        return false;
    }
}