a=int(input())
s=list(input().split())
i,e=(input().split())

s.insert(int(i)-1,(e))
t=' '.join(s)
print(t)
