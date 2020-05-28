s = input()
l = list(s)
a =[]
b =[]
for i in range(len(l)//2):
    a.append(l[i])
for i in range((len(l)//2),len(l)):
    b.append(l[i])

for i in range(len(a)):
    a[i] = ord(a[i])-65
    b[i] = ord(b[i])-65

p1 = 0
p2 = 0
for i in range(len(a)):
    p1+=a[i]
    p2+=b[i]

for i in range(len(a)):
    if(a[i]+p1<=25):
        a[i] = a[i]+p1
    else:
        p = p1
        p = p-(25-a[i])-1
        while(p>25):
            p = p-26
        a[i] = p

    if (b[i] + p2 <= 25):
        b[i] = b[i] + p2
    else:
        p = p2
        p = p - (25 - b[i]) - 1
        while (p > 25):
            p = p - 26
        b[i] = p

    if (a[i] + b[i] <= 25):
        a[i] = a[i] + b[i]
    else:
        p = b[i]
        p = p - (25 - a[i]) - 1
        while (p > 25):
            p = p - 26
        a[i] = p
    a[i] = chr(a[i]+65)
for i in a:
    print(i,end='')