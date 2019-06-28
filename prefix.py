li=[]
a=int(input())
for i in ramge(a):
  b=input()
  li.append(b)
li.sort()
c,d=li[0],li[-1]
li2=[]
for i in range(len(c)):
  if c[i]==d[i]:
    print(c[i])
print("".join(li2))
