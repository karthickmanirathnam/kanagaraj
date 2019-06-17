a=int(input())
l1=[]
li=list(map(int,input().split()))
for i in range(0,a):
    if(i==li[i]):
        l1.append(i)
l1.sort()
for i in l1:
    print(i,end=" ")
