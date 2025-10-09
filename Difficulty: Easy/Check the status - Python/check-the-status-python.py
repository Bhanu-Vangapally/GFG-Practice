class Solution:
    def checkStatus(self, a, b, flag):
        # code here
        if (a<0 and b<0 and flag==True) or ((a<0 and b>0) or (a>0 and b<0)) and flag==False :
            return True
        else:
            return False