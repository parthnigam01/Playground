a,b,c= input().split()
a=list(a)
for i in range(len(a)):
  if a[i]==b:
    a[i]=c
  elif a[i]==c:
    a[i]=b
print(''.join(a))