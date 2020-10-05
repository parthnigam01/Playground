num1,num2 = (input().split())
num1=int(num1)
num2=int(num2)
count=0
carry=0
while(num1!=0 and num2!=0):
    p=num1%10
    q=num2%10
    s=p+q+carry
    if s>9:
        carry=1
        count=count+1
    else:
        carry=0
        
    num1=num1/10
    num2=num2/10
print(count)