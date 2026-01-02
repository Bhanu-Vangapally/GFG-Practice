class Solution:
    def countSubstr (self, s, k):
        # Code here
        n=len(s)
        res=set()
        for i in range(n):
            fq={}
            uc=0
            for j in range(i,n):
                c=s[j]
                fq[c]=fq.get(c,0)+1
                if fq[c]==1: 
                    uc+=1
                if uc==k:
                    res.add(s[i:j+1])
                if uc>k:
                    break
        return len(res) 