a=int(input("enter the number:"))
b=0
while(a>0):
  c=a%10
  b=(b*10)+c
  a//=10
print("the reverse of a number is:%d" %b)  
