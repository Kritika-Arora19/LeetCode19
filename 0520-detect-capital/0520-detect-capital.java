class Solution {
    public boolean detectCapitalUse(String word) {
        int f=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(c))
            f++;
        }
        if(f==word.length())
        return true;
        f=0;
        for(int i=0;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isLowerCase(c))
            f++;
        }
        if(f==word.length())
        return true;
        f=0;
        for(int i=1;i<word.length();i++)
        {
            char c=word.charAt(i);
            if(Character.isUpperCase(word.charAt(0)) && Character.isLowerCase(c))
            f++;
        }
        if(f==word.length()-1)
        return true;

    return false;    
    }
}