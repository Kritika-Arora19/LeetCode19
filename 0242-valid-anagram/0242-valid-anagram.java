class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;

        int []a = new int[26];
        int []b=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            int c1=(int)c-97;
            a[c1]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char c=t.charAt(i);
            int c2=(int)c-97;
            b[c2]++;
        }
        for(int j=0;j<26;j++)
        {
            if(a[j]!=b[j])
            return false;
        }
        return true;
    }
}