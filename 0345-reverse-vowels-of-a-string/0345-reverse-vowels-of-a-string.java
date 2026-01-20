class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb= new StringBuilder();
        int k=0;
        for (char c : s.toCharArray())
        {
            if ("aeiouAEIOU".indexOf(c) != -1) 
            sb.append(c);
        }
        String s1=sb.reverse().toString();
        StringBuilder ok= new StringBuilder();
        for (char c1 : s.toCharArray())
        {
             if ("aeiouAEIOU".indexOf(c1) != -1)
            {
                ok.append(s1.charAt(k++));
            }
            else
            ok.append(c1);
        }
        return ok.toString();
    }
}