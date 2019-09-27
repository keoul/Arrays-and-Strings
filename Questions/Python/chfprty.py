for _ in range(int(input())):
    n=int(input())
    li=list(map(int,input().split()))
    li.sort()
    count=0;
    for i in li:
        if count<i:
            break
        count+=1
    print(count)
