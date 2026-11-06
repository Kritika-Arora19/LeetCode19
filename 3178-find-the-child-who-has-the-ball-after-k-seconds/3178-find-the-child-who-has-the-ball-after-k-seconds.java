class Solution {
    public int numberOfChild(int n, int k) {
        int c=2*(n-1);
        k=k%c;
        if(k<n)
        return k;
        else
        return n-(k-(n-2));
    }
}