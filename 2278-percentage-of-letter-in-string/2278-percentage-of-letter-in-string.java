class Solution {
    public int percentageLetter(String s, char letter) {
        int k=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c == letter)
            k++;
        }
        return Math.round((k*100)/s.length());
    }
}