c,n =  map(int,input().split())
consistent = True
max_capacity= c
people_in_train = 0

for i in range(n):
    l,e,s = map(int,input().split())

    # if #left > #people in train
    if(l>people_in_train):
        consistent = False
        break

    people_in_train -= l
    people_in_train += e

    # if capacity is exceed
    if(people_in_train>max_capacity):
        consistent = False
        break

    # if capacity is not full but someone is waiting
    if (max_capacity != people_in_train):
        if(s!=0):
            consistent = False
            break

    # at last station
    # if someone is still train or someone is waiting
    if(i==n-1):
        if(people_in_train!=0 or s!=0):
            consistent = False
            break


if(consistent): print('possible')
else: print('impossible')

