class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int no=Integer.parseInt(s,2);
        int c=0;
        while(no>0)
        {
            if((no&1)==1)
            c++;
            no=no>>1;
        }
        return c;
    }
}