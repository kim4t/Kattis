n = int(input())
for i in range(n):
    line = input().split()
    answer = 0
    for j in range(2,len(line)):
        if(int(line[j])-int(line[j-1])!=1):
            answer = j
            break
    print(answer)