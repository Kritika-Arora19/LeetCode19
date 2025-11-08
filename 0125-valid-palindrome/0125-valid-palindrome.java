class Solution {
    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        String s1,s2;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                sb.append(c);
            }
        }
        s1=sb.toString();
        s2 = sb.reverse().toString();
       return s1.equals(s2);
    }
}