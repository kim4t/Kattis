type, s = input().split()
list = list(s)
if(type=='E'):
    count = 1
    answer = ''
    for i in range(len(list)-1):
        if(list[i]==list[i+1]):
            count+=1
        else:
            answer+=list[i]+str(count)
            count=1
    if(list[len(list)-1]==list[len(list)-2]):
        answer+=list[len(list)-1]+str(count)
    else:answer+=list[len(list)-1]+'1'
    print(answer)
else:
    answer=''
    for i in range(len(list)):
        if(list[i].isnumeric()):
            num = int(list[i])
            char = list[i-1]
            for j in range(num-1):
                answer+=char
        else:
            answer+=list[i]

    print(answer)
