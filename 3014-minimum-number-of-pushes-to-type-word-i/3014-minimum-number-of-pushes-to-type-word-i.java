class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int c=0;
        if(n<=8)
        c=n;
        else if(n>8 && n<=16)
        c=8+2*(n-8);
        else if(n>16 && n<=24)
        c=24 + 3*(n-16);
        else
        c=48+4*(n-24);
        return c;
    }
}