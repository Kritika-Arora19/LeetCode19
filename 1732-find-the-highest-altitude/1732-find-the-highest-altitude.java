class Solution {
    public int largestAltitude(int[] gain) {
        int[] h=new int[gain.length+1];
        h[0]=0;
        for(int i=0;i<gain.length;i++)
        {
            h[i+1]=gain[i]+h[i];
        }
        int high=h[0];
        for(int j=0;j<h.length;j++)
        {
            if(h[j]>high)
            high=h[j];
        }
        return high;
    }
}