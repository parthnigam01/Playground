def dectobin(num):
  if num>1:
    dectobin(num//2)
  print(num%2,end='')
num =int(input())
dectobin(num)

   