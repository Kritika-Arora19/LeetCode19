class Solution {
    public int firstUniqChar(String s) {
        int []a=new int[26];
        for(int i=0;i<s.length();i++)
        {
            int n=(int)(s.charAt(i))-97;
            a[n]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int no=(int)(s.charAt(i))-97;
            if(a[no]==1)
            return i;
        }
        return -1;
    }
}