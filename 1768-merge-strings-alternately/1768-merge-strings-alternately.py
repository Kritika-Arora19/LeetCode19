class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        l1=len(word1)
        l2=len(word2)
        s=""
        ans=""
        if l1-l2>0:
            d=l2
            s=word1[l2:]
        elif l2-l1>0:
            d=l1
            s=word2[l1:]
        else:
            d=l2

        for i in range(d):
            ans=ans+word1[i]+word2[i]  

        ans=ans+s  
        return ans   

