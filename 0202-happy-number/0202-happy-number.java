class Solution {
    public boolean isHappy(int n) {
        int sum=0,num=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(sum!=1)
        {
            sum=0;
            num=n;
            while(n!=0)
            {
                int r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            map.put(num,sum);
            n=sum;
            if(sum==1)
            return true;
            if(sum==4)
            return false;
        }
        return false;
    }
}