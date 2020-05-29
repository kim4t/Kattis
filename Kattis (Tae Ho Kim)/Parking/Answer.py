a,b,c = map(int,input().split())
list = [0]*101
max = 0
for i in range(3):
    s,f = map(int,input().split())
    if(f>max):max=f
    for j in range(s,f):
        list[j+1]+=1
total = 0
for i in range(1,max+1):
    if(list[i]==1):
        total+=a
    elif(list[i]==2):
        total+=b*2
    elif(list[i]==3):
        total+=c*3
print(total)
