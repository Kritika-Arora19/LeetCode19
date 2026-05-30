class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb= new StringBuilder();
        for(char c:s.toCharArray()){
            int v=(c-'a')+1;
            sb.append(v);
        }
        String ns=sb.toString();
        int sum=0;
        while(k>0)
        {
            sum=0;
            for(char c1:ns.toCharArray())
            {
                sum+=c1-'0';
            }
            ns=String.valueOf(sum);
            k--;
        }
    return sum;
    }
}