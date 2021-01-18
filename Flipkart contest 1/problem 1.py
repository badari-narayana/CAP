class Solution:
    def smallestnum (self,N):
        # code here 
        s=str(N)
        an=""
        l=[int(x) for x in s]
        l.sort()
        if(l[0]==0):
            i=l.count(0)
            l[0]=l[i]
            l[i]=0
        for i in range(len(l)):
            an+=str(l[i])
        return int(an)
        
