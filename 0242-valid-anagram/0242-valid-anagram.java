class Solution {
    public boolean isAnagram(String s, String t) {
        int []a = new int[26];
        int []b=new int[26];
        for(char ch:s.toCharArray())
        {
            a[ch-'a']++;
        }
        for(char ch:t.toCharArray())
        {
            b[ch-'a']++;
        }
        for(int j=0;j<26;j++)
        {
            if(a[j]!=b[j])
            return false;
        }
        return true;
    }
}