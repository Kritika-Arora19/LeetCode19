class Solution {
    public int addDigits(int num) {
        int n=num;
        int s=0;
        while(n>0)
        {
            int r=n%10;
            s=s+r;
            n=n/10;
            if(n==0 && s>=10){
                n=s;
                s=0;
            }
        }
        return s;
    }
}