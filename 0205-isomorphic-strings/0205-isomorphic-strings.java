class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        String n="",n1="";
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> map1=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),t.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            n=n+map.get(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            map1.put(t.charAt(i),s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            n1=n1+map1.get(t.charAt(i));
        }
        if(n.equals(t) && n1.equals(s))
        return true;
        else
        return false;
    }
}