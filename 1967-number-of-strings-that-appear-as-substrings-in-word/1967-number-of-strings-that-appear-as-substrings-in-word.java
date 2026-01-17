class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(int i=0;i<patterns.length;i++)
        {
            int id=word.indexOf(patterns[i]);
            if(id!=-1)
            c++;
        }
        return c;
    }
}