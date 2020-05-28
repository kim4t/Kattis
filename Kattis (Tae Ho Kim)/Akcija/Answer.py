n = int(input())
arr =list()
for i in range(n):
    arr.append(int(input()))
arr = sorted(arr,reverse=True)
size = len(arr)
x = size/3
xCount = 0;

for i in range(2,size,3):
    if (i>size) or(xCount>=x):
        break;
    arr[i] = -1
    xCount+=1

count = 0
for i in range(len(arr)):
    if arr[i] != -1:
        count+=arr[i]
print(count)