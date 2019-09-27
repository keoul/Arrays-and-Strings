n=int(input())
str=input()
fs=''
i=0
count=0
while i<n:
    try:
        if str[i]=='0' and str[i+1]=='1' and str[i+2]=='0':
            fs+='011'
            i+=3
            count+=1
            continue
    except:
        fs+=str[i]        
    i+=1
print(count)
