k=int(input())
x=list(map(int,input().split()))
y=sorted(x)[::-1]
z=""
if(x==[0]*k):
    print("0")
else:
    for j in y:
        z=z+str(j)
    print(int(z))   
