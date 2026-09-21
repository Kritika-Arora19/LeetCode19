class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int as=c;
            int p=(97-as+26)*(i+1);
            sum+=p;
    }
    return sum;
}
}