listA = list(input())
listB = list(input())
aLen = len(listA)
bLen = len(listB)
if(aLen - bLen!=0):
    if(aLen>bLen):
        dif = aLen-bLen
        for i in range(dif):
            listB.insert(0,-1)

    else:
        dif - bLen-aLen
        for i in range(dif):
           listA.insert(0,-1)

newA= ""
newB= ""
for i in range(len(listA)):
    if(int(listA[i])>int(listB[i])):
        newA+=(listA[i])

    elif(int(listA[i])<int(listB[i])):
        newB+=(listB[i])

    else:
        newA+=(listA[i])
        newB+=(listB[i])

if(newA==""):
    print("YODA")
else:print(int(newA))

if(newB==""):
    print("YODA")
else:print(int(newB))

