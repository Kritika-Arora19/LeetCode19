class Solution {
    public int passThePillow(int n, int time) {
        int c=2*(n-1);
        time=time%c;
        if(time<n)
        return time+1;
        else
        return n-(time-(n-1));
    }
}