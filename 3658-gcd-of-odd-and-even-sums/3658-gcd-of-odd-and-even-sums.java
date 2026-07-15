class Solution {
    public int gcdOfOddEvenSums(int n) {
        int i=0,k=1,sumEven=0,sumOdd=0;
        while(i!=n*2)
        {
            if(k%2==0)
            sumEven+=k;
            else
            sumOdd+=k;

            i++;
            k++;
        }
        while(sumEven!=0)
        {
            int temp=sumEven;
            sumEven=sumOdd%sumEven;
            sumOdd=temp;
        }
        return sumOdd;

    }
}