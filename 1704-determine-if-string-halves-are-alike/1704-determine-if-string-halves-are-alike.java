class Solution {
    public boolean halvesAreAlike(String s) {
        int n=s.length();
        int count=0,count1=0;
        char c,c1;
        String s1=s.substring(0,n/2);
        String s2=s.substring(n/2,n);
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if("aeiouAEIOU".indexOf(c) !=-1)
            count++;
        }
        for(int j=0;j<s2.length();j++)
        {
            c1=s2.charAt(j);
            if("aeiouAEIOU".indexOf(c1) !=-1)
            count1++;
        }
        if(count==count1)
        return true;
        else
        return false;
    }
}