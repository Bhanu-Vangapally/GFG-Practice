#User function Template for python3

class Solution:
    def smallerThanX(self,arr,n,x):
        #return required ans
        #code here
        c=0
        for i in arr:
            if i<x:
                c+=1
        return c