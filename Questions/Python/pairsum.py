n,k=map(int,input().split())
li=list(map(int,input().split()))
di={}
for i in li:
    di[i]=di.get(i,0)+1
for i in li:
    if di.get(k-i,0)!=0:
        print(i,k-i)
        di[i]-=1
                
