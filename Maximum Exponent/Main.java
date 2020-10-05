def countExponents(i):

    count = 0

    while i%2 == 0 and i != 0:

        count+=1

        i = i//2

    return count

def maxExponents(a, b):

    maximum, number = 0, a

    for i in range(a,b+1):

        temp = countExponents(i)

        if temp>maximum:

            maximum, number = temp, i

    return number

a = int(input())
b=int(input())
print(maxExponents(a, b))