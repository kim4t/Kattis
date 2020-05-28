s,t,n = map(int,input().split())
d = input().split()
b = input().split()
c = input().split()
total = 0
for i in d:
    total += int(i)
for i in b:
    total += int(i)
sum = int(d[0])
stop = [sum]
for i in range(n-1):
    sum+= int(d[i])+int(b[i])
    stop.append(sum)

for i in range(n):
    x = stop[i]
    y = int(c[i])
    dif = 0
    if x<y:
        dif = y-x
    else: dif = y-(x%y)
    total+= dif
if total<=t : print('yes')
else: print('no')