a=int(input())
b=input().split()
for i in range(0,a):
  c=b.count(b[i])
  if(c<2):
    print(a[i])
