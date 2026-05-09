class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String s1=s;
        int i=0;
        while(i<n)
        {
            char c=s1.charAt(0);
            String c1=s1.substring(1,n);
            String ns=c1+c;
            if(ns.equals(goal))
            return true;
            else{
                i++;
                s1=ns;
            }
        }
        return false;
    }
}