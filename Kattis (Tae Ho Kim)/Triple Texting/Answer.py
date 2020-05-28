s = input()
list = list(s)
l = len(list)//3
w1=''
w2=''
w3=''
for i in range(len(list)):
    if(i<l): w1+=list[i]
    elif(l<=i<2*l): w2+=list[i]
    else: w3+=list[i]
if(w1==w2):
    print(w1)
else:print(w3)