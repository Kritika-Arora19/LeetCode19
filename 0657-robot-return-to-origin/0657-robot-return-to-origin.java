class Solution {
    public boolean judgeCircle(String moves) {
        char c;
        int x=0,y=0;
        for(int i=0;i<moves.length();i++)
        {
            c=moves.charAt(i);
            if(c=='U')
            y=y+1;
            else if(c=='D')
            y=y-1;
            else if(c=='L')
            x=x-1;
            else
            x=x+1;
        }
        if(x==0 && y==0)
        return true;
        else
        return false;
    }
}