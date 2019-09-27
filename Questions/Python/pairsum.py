def pairsumn2(li,n,k):
    for i in range(n-1):
        for j in range(i+1,n):
            if li[i]+li[j]==k:
                print(min(li[i],li[j]),max(li[i],li[j]))
def pairsumn(li,n,k):
    di={}
    for i in li:
        di[i]=di.get(i,0)+1
    for i in li:
        if di.get(i,0)!=0:
            if di.get(k-i,0)!=0:
                for o in range(di.get(i,0)*di.get(k-i,0)):
                    print(min(i,k-i),max(i,k-i))
                    di[i]=0
                    di[k-i]=0
def pairsumnlogn(li,n,k):
    i=0
    j=n-1
    li=sorted(li)
    while i<=j:
        if li[i]+li[j]>k:
            j-=1
        elif li[i]+li[j]<k:
            i+=1
        else:
            print(li[i],li[j])
            i+=1
            j-=1

''' If repetitions are allowed
def pairsumnlogn(li,n,k):
    i=0
    j=n-1
    li=sorted(li)
    while i<=j:
        if li[i]+li[j]>k:
            j-=1
        elif li[i]+li[j]<k:
            i+=1
        else:
            t=li[i]
            u=li[j]
            si=1
            while True:
                if li[i+1]==li[i]:
                    i+=1
                    si+=1
                else:
                    i+=1
                    break
            sj=1
            while True:
                if li[j-1]==li[j]:
                    j-=1
                    sj+=1
                else:
                    j-=1
                    break
            for i in range(si*sj):
                print(t,u)
'''


n,k=map(int,input().split())
li=list(map(int,input().split()))
